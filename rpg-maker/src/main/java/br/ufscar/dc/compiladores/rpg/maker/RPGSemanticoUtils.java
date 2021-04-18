package br.ufscar.dc.compiladores.rpg.maker;

import java.util.ArrayList;
import java.util.List;


public class RPGSemanticoUtils {

    public static List<String> errosSemanticos = new ArrayList<>();
        
    //Verifica a qual classe o personagem pertence
    public static TabelaDeSimbolos.Classe verificarClasse(TabelaDeSimbolos tabela, RpgGramParser.Declaracao_localContext ctx) {
        String classe = ctx.classe().getText();

        switch (classe) {
            case "animago":    return TabelaDeSimbolos.Classe.ANIMAGO;
            case "espadachim": return TabelaDeSimbolos.Classe.ESPADACHIM;
            case "necromante": return TabelaDeSimbolos.Classe.NECROMANTE;
            case "bardo":      return TabelaDeSimbolos.Classe.BARDO;                
            case "paladino":   return TabelaDeSimbolos.Classe.PALADINO;              
            default:
                File.AddString("                    <div id=\"erros\">" + 
                    "Erro: a classe " + classe + " não existe!</div>\n");
                return TabelaDeSimbolos.Classe.INVALIDO;
        }
    }
    
    public static TabelaDeSimbolos.Classe verificarClasse(TabelaDeSimbolos tabela, String nomePersonagem) {
        if (tabela.existe(nomePersonagem)) {
            return tabela.verificar(nomePersonagem);
        } else {
            return TabelaDeSimbolos.Classe.INVALIDO;
        }
    }
    
    //Verifica a qual classe o encantamento de ataque pertecem
    public static TabelaDeSimbolos.Classe verificarClasse(TabelaDeSimbolos tabela, RpgGramParser.EncantamentoAtaqueContext ctx) {
        if (ctx.encantamentoAtaqueAnimago() != null) {
            return TabelaDeSimbolos.Classe.ANIMAGO;
        } else if (ctx.encantamentoAtaqueEspadachim() != null) {
            return TabelaDeSimbolos.Classe.ESPADACHIM;
        } else if (ctx.encantamentoAtaqueNecromante() != null) {
            return TabelaDeSimbolos.Classe.NECROMANTE;
        } else if (ctx.encantamentoAtaqueBardo() != null) {
            return TabelaDeSimbolos.Classe.BARDO;
        } else if (ctx.encantamentoAtaquePaladino() != null) {
            return TabelaDeSimbolos.Classe.PALADINO;
        } else {
            return TabelaDeSimbolos.Classe.INVALIDO;
        }
    }
    
    //Verifica a qual classe o encantamento de defesa pertecem
    public static TabelaDeSimbolos.Classe verificarClasse(TabelaDeSimbolos tabela, RpgGramParser.EncantamentoDefesaContext ctx) {
        if (ctx.encantamentoDefesaAnimago() != null) {
            return TabelaDeSimbolos.Classe.ANIMAGO;
        } else if (ctx.encantamentoDefesaEspadachim() != null) {
            return TabelaDeSimbolos.Classe.ESPADACHIM;
        } else if (ctx.encantamentoDefesaNecromante() != null) {
            return TabelaDeSimbolos.Classe.NECROMANTE;
        } else if (ctx.encantamentoDefesaBardo() != null) {
            return TabelaDeSimbolos.Classe.BARDO;
        } else if (ctx.encantamentoDefesaPaladino() != null) {
            return TabelaDeSimbolos.Classe.PALADINO;
        } else {
            return TabelaDeSimbolos.Classe.INVALIDO;
        }
    }
    
    //Verifica a qual classe o encantamento de fuga pertecem
    public static TabelaDeSimbolos.Classe verificarClasse(TabelaDeSimbolos tabela, RpgGramParser.EncantamentoFugaContext ctx) {
        if (ctx.encantamentoFugaAnimago() != null) {
            return TabelaDeSimbolos.Classe.ANIMAGO;
        } else if (ctx.encantamentoFugaEspadachim() != null) {
            return TabelaDeSimbolos.Classe.ESPADACHIM;
        } else if (ctx.encantamentoFugaNecromante() != null) {
            return TabelaDeSimbolos.Classe.NECROMANTE;
        } else if (ctx.encantamentoFugaBardo() != null) {
            return TabelaDeSimbolos.Classe.BARDO;
        } else if (ctx.encantamentoFugaPaladino() != null) {
            return TabelaDeSimbolos.Classe.PALADINO;
        } else {
            return TabelaDeSimbolos.Classe.INVALIDO;
        }
    }   
  
    //Verifica a qual classe o encantamento de cura pertecem
    public static TabelaDeSimbolos.Classe verificarClasse(TabelaDeSimbolos tabela, RpgGramParser.EncantamentoCuraContext ctx) {
        if (ctx.encantamentoCuraAnimago() != null) {
            return TabelaDeSimbolos.Classe.ANIMAGO;
        } else if (ctx.encantamentoCuraEspadachim() != null) {
            return TabelaDeSimbolos.Classe.ESPADACHIM;
        } else if (ctx.encantamentoCuraNecromante() != null) {
            return TabelaDeSimbolos.Classe.NECROMANTE;
        } else if (ctx.encantamentoCuraBardo() != null) {
            return TabelaDeSimbolos.Classe.BARDO;
        } else if (ctx.encantamentoCuraPaladino() != null) {
            return TabelaDeSimbolos.Classe.PALADINO;
        } else {
            return TabelaDeSimbolos.Classe.INVALIDO;
        }
    }  
}
