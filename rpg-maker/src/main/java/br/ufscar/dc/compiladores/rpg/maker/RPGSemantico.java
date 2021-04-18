package br.ufscar.dc.compiladores.rpg.maker;
import br.ufscar.dc.compiladores.rpg.maker.TabelaDeSimbolos.Classe;

public class RPGSemantico extends RpgGramBaseVisitor<Void> {

    TabelaDeSimbolos tabela;
    Encantamentos enc;
    
    // Variável auxiliar que relaciona cada personagem a uma div
    int codCharacter = 0;
    
    @Override
    public Void visitPrograma(RpgGramParser.ProgramaContext ctx) {
        
        tabela = new TabelaDeSimbolos();        
        enc = new Encantamentos();
        enc.initLivroDeEncantamentos();
        
        return super.visitPrograma(ctx);
    } 
    
    /*Classe responsavel por fazer o tratamento do nome da classe do personagem para ser inserido no arquivo de saida,
      verificar se um mesmo personagem foi declarado mais de uma vez e cria a div do personagem contendo o nome, a classe e
      se o personagem pertence a uma classe especial*/
    @Override
    public Void visitDeclaracao_local(RpgGramParser.Declaracao_localContext ctx) {
        if (ctx.classe() != null) {
            Classe classe = RPGSemanticoUtils.verificarClasse(tabela, ctx);
            String classeDiv;
            String character = ctx.Nome().getText();
            
            switch (classe) {
                case ANIMAGO: classeDiv = "Animago";
                    break;
                case ESPADACHIM: classeDiv = "Espadachim";
                    break;
                case NECROMANTE: classeDiv = "Necromante";
                    break;
                case BARDO: classeDiv = "Bardo";
                    break;
                case PALADINO: classeDiv = "Paladino";
                    break;                    
                default: classeDiv = "Classe inválida";
                    break;
            }
            
            //Verifica se o personagem ja foi declarado
            if (tabela.existe(character)) {
                File.AddString("                    <div id=\"erros\">" + 
                    "Atenção!! O personagem " + character + " já existe.</div>\n");
            } else if(ctx.status() != null) {
                String status = ctx.status().getText();
                
                tabela.add(character, classe, status, codCharacter);
                
                if (status.equals("sim")) status = "especial";
                else status = "especial";
                
                String div = "                <td><div id=\"box\">\n"
                        + "                    <h1><font color=\"#077F09\">" + character + "</font></h1>\n"
                        + "                    <font color=\"#2D7F2F\">Classe: " + classeDiv + "</font><br>\n"
                        + "                    <font color=\"#2D7F2F\">Tipo: " + status + "</font><p><p><p>\n";              
                File.addDiv(div);
                codCharacter++;
            }
        }
        return super.visitDeclaracao_local(ctx);
    }

    /* visitCmdCure, visitCmdAtaque, visitCmdFuja, visitCmdDefenda seguem a mesma estrutura, logo o que for descrito sobre visitCmdAtaque
       vale para os outros */
    
    @Override
    public Void visitCmdAtaque(RpgGramParser.CmdAtaqueContext ctx) {
        
        String character = ctx.Nome().getText();
        Classe classe = RPGSemanticoUtils.verificarClasse(tabela, character); //Classe do personagem
        
        //Verifica se o personagem foi declarado
        if (!tabela.existe(character)) {
            File.AddString("                    <div id=\"erros\">" + 
                "Personagem " + character + " não declarado</div>\n");
        } else {
            int codigo = tabela.veriticarCodigo(character);
            File.appendDiv(codigo, 
                    "                    <h3><font color=\"#000000\">Encantamentos de Ataque</font></h3><p>\n");
            // Percorre a lista de encantamentos de ataque validando-os e retornando no arquivo de saida
            for(int i = 0; i < ctx.encantamentoAtaque().size(); i++) {
                Classe cs = RPGSemanticoUtils.verificarClasse(tabela, ctx.encantamentoAtaque().get(i));
                String spell = ctx.encantamentoAtaque().get(i).getText();
                
                //Verificacao do tipo de encantamento e a classe ao qual ela pertence
                if (cs == TabelaDeSimbolos.Classe.INVALIDO) {
                    File.appendDiv(codigo, 
                    "                    <font color=\"#EE0000\">O encantamento \"" + spell + "\" não é de ataque!</font><p>\n");
                } else if (cs != classe) {//verifica se o encantamento pertence a classe do personagem
                    File.appendDiv(codigo, 
                    "                    <font color=\"#EE0000\">O encantamento \"" + spell + "\" não é dessa classe!</font><p>\n");
                } else {
                    int mana = 0; // Variavel para conter o custo de mana do encatamento
                    
                    if (!tabela.verificarStatus(character)) { //verifica se a classe do personagem é especial 
                        if (enc.existe(spell)) {

                            mana = enc.getMana(spell);
                    
                            tabela.addSpell(character, spell);
                            
                            File.appendDiv(codigo, 
                                    "                    <div href=\"#\" class=\"tooltip\"><u>"
                                    + spell + "</u>\n"
                                    + "                        <div class=\"tooltiptext\">\n"
                                    + "                        </div>\n"
                                    + "                    </div><br>\n"
                                    + "                    <font color=\"#03658C\">Custo de mana: </font> " 
                                    + mana + "<p>\n");
                        } else {
                            File.appendDiv(codigo, 
                    "                    <font color=\"#EE0000\">O encantamento \"" + spell + "\" é somente para classe personagens de classe especial!</font><p>\n");
                        }
                    } else {
                        tabela.addSpell(character, spell);

                        //Busca o encantamento  na lista de encantamentos (Encantamentos.java) e retorna o custo de mana do encantamento
                        if (enc.existe(spell)) {
                            mana = enc.getMana(spell);
                        }else{
                            mana = enc.getMana(spell);
                        }
                        File.appendDiv(codigo, 
                                "                    <div href=\"#\" class=\"tooltip\"><u>"
                                + spell + "</u>\n"
                                + "                        <div class=\"tooltiptext\">\n"
                                        + "                        </div>\n"
                                + "                    </div><br>\n"
                                + "                    <font color=\"#03658C\">Custo de mana: " 
                                + mana + "</font><p>\n");
                    }
                }
            }       
        }

        return super.visitCmdAtaque(ctx);
    }
            
    
    @Override
    public Void visitCmdCure(RpgGramParser.CmdCureContext ctx) {
        
        String character = ctx.Nome().getText();
        Classe classePersonagem = RPGSemanticoUtils.verificarClasse(tabela, character);

        if (!tabela.existe(character)) {
            File.AddString("                    <div id=\"erros\">" + 
                "Personagem " + character + " não declarado</div>\n");
        } else {
            int codigo = tabela.veriticarCodigo(character);
            File.appendDiv(codigo, 
                    "                    <h3><font color=\"#000000\">Encantamento de Cura</font></h3><p>\n");            
            for (int i = 0; i < ctx.encantamentoCura().size(); i++) {

                Classe cs = RPGSemanticoUtils.verificarClasse(tabela, ctx.encantamentoCura().get(i));
                String spell = ctx.encantamentoCura().get(i).getText();
                
                if (cs == TabelaDeSimbolos.Classe.INVALIDO) {
                    File.appendDiv(codigo, 
                    "                    <font color=\"#EE0000\">O encatamento \"" + spell + "\" não é de cura!</font><p>\n");
                } else if (cs != classePersonagem) {
                    File.appendDiv(codigo, 
                    "                    <font color=\"#EE0000\">O encatamento \"" + spell + "\" não é dessa classe!</font><p>\n");
                } else {
                    int mana = 0;
                    
                    if (!tabela.verificarStatus(character)) {
                        if (enc.existe(spell)) {                            
                            mana = enc.getMana(spell);
                    
                            tabela.addSpell(character, spell);
                            
                            File.appendDiv(codigo, 
                                    "                    <div href=\"#\" class=\"tooltip\"><u>"
                                    + spell + "</u>\n"
                                    + "                        <div class=\"tooltiptext\">\n"
                                            + "                        </div>\n"
                                    + "                    </div><br>\n"
                                    + "                    <font color=\"#03658C\">Custo de mana: " 
                                    + mana + "</font><p>\n");
                        } else {
                            File.appendDiv(codigo, 
                    "                    <font color=\"#EE0000\">O encantamento \"" + spell + "\" é somente para personagens da classe especial!</font><p>\n");
                        }
                    }else{
                        tabela.addSpell(character, spell);
                        
                        //Procura o encantamento na lista de encantamentos (Entamentos.java)e retorna a quantidade de mana que o encantamento requer
                        if (enc.existe(spell)) {
                            mana = enc.getMana(spell);                       
                        }
                        File.appendDiv(codigo, 
                                "                    <div href=\"#\" class=\"tooltip\"><u>"
                                + spell + "</u>\n"
                                + "                        <div class=\"tooltiptext\">\n"                            
                                        + "                        </div>\n"
                                + "                    </div><br>\n"
                                + "                    <font color=\"#03658C\">Custo de mana: " 
                                + mana + "</font><p>\n");
                    }                    
                }
            }                   
        }
        return super.visitCmdCure(ctx);
    }
    
        
    @Override
    public Void visitCmdFuja(RpgGramParser.CmdFujaContext ctx) {        
        
        String character = ctx.Nome().getText();
        Classe classe = RPGSemanticoUtils.verificarClasse(tabela, character);

        if (!tabela.existe(character)) {
            File.AddString("                    <div id=\"erros\">" + 
                "Personagem " + character + " não declarado</div>\n");
        } else {
            int codigo = tabela.veriticarCodigo(character);
            File.appendDiv(codigo, 
                    "                    <h3><font color=\"#000000\">Encantamentos de Fuga</font></h3><p>\n");
  
            for(int i = 0; i < ctx.encantamentoFuga().size(); i++) {
                Classe cs = RPGSemanticoUtils.verificarClasse(tabela, ctx.encantamentoFuga().get(i));
                String spell = ctx.encantamentoFuga().get(i).getText();
                
                if (cs == TabelaDeSimbolos.Classe.INVALIDO) {
                    File.appendDiv(codigo, 
                    "                    <font color=\"#EE0000\">O encantamento \"" + spell + "\" não é de Fuga!</font><p>\n");
                } else if (cs != classe) {
                    File.appendDiv(codigo, 
                    "                    <font color=\"#EE0000\">O encantamento \"" + spell + "\" não é dessa classe!</font><p>\n");
                } else {
                    int mana = 0;
                    
                    if (!tabela.verificarStatus(character)) {
                        if (enc.existe(spell)) {

                            mana = enc.getMana(spell);
                    
                            tabela.addSpell(character, spell);
                            
                            File.appendDiv(codigo, 
                                    "                    <div href=\"#\" class=\"tooltip\"><u>"
                                    + spell + "</u>\n"
                                    + "                        <div class=\"tooltiptext\">\n"
                                            + "                        </div>\n"
                                    + "                    </div><br>\n"
                                    + "                    <font color=\"#03658C\">Custo de mana: " 
                                    + mana + "</font><p>\n");
                        } else {
                            File.appendDiv(codigo, 
                    "                    <font color=\"#EE0000\">O encantamento \"" + spell + "\" é somente para personagens da classe especial.</font><p>\n");
                        }
                    } else {
                        tabela.addSpell(character, spell);

                        if (enc.existe(spell)) {
                            mana = enc.getMana(spell);
                        }else{
                            mana = enc.getMana(spell);
                        }
                        File.appendDiv(codigo, 
                                "                    <div href=\"#\" class=\"tooltip\"><u>"
                                + spell + "</u>\n"
                                + "                        <div class=\"tooltiptext\">\n"
                                        + "                        </div>\n"
                                + "                    </div><br>\n"
                                + "                    <font color=\"#03658C\">Custo de mana: " 
                                + mana + "</font><p>\n");
                    }                    
                }
            }       
        }

        return super.visitCmdFuja(ctx);
    }

   
    @Override
    public Void visitCmdDefenda(RpgGramParser.CmdDefendaContext ctx) {
        
        String character = ctx.Nome().getText();
        Classe classe = RPGSemanticoUtils.verificarClasse(tabela, character);

        if (!tabela.existe(character)) {
            File.AddString("                    <div id=\"erros\">" + 
                "Personagem " + character + " não declarado</div>\n");
        } else {
            int codigo = tabela.veriticarCodigo(character);
            File.appendDiv(codigo, 
                    "                    <h3><font color=\"#000000\">Encantamentos de Defesa</font></h3><p>\n");
  
            for(int i = 0; i < ctx.encantamentoDefesa().size(); i++) {
                Classe cs = RPGSemanticoUtils.verificarClasse(tabela, ctx.encantamentoDefesa().get(i));
                String spell = ctx.encantamentoDefesa().get(i).getText();
                
                if (cs == TabelaDeSimbolos.Classe.INVALIDO) {
                    File.appendDiv(codigo, 
                    "                    <font color=\"#000000\">O encantamento \"" + spell + "\" não é de defesa!</font><p>\n");
                } else if (cs != classe) {
                    File.appendDiv(codigo, 
                    "                    <font color=\"#000000\">O encantamento \"" + spell + "\" não é dessa classe!</font><p>\n");
                } else {
                    int mana = 0;
                    
                    if (!tabela.verificarStatus(character)) {
                        if (enc.existe(spell)) {

                            mana = enc.getMana(spell);
                    
                            tabela.addSpell(character, spell);
                            
                            File.appendDiv(codigo, 
                                    "                    <div href=\"#\" class=\"tooltip\"><u>"
                                    + spell + "</u>\n"
                                    + "                        <div class=\"tooltiptext\">\n"
                                            + "                        </div>\n"
                                    + "                    </div><br>\n"
                                    + "                    <font color=\"#03658C\">Custo de mana: " 
                                    + mana + "</font><p>\n");
                        } else {
                            File.appendDiv(codigo, 
                    "                    <font color=\"#EE0000\">O encantamento \"" + spell + "\" é somente para personagens da classe especial.</font><p>\n");
                        }
                    } else {
                        tabela.addSpell(character, spell);

                        if (enc.existe(spell)) {
                            mana = enc.getMana(spell);
                        }else{
                            mana = enc.getMana(spell);
                        }
                        File.appendDiv(codigo, 
                                "                    <div href=\"#\" class=\"tooltip\"><u>"
                                + spell + "</u>\n"
                                + "                        <div class=\"tooltiptext\">\n"
                                        + "                        </div>\n"
                                + "                    </div><br>\n"
                                + "                    <font color=\"#03658C\">Custo de mana: " 
                                + mana + "</font><p>\n");
                    }
                }
            }                   
        }
        return super.visitCmdDefenda(ctx);
    }    
}
    
    
    
    


