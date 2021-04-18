package br.ufscar.dc.compiladores.rpg.maker;

import br.ufscar.dc.compiladores.rpg.maker.RpgGramParser.ProgramaContext;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/*
    Autor: Felipe Francisco Berreta
    RA: 422649
*/

public class Principal {    
    public static void main(String args[]) throws IOException {
        
        // Chamada para criação dos arquivos 
        File.criaArquivo(args[1]);

        // Criação da linguagem e seus tokens
        CharStream cs = CharStreams.fromFileName(args[0]);
        RpgGramLexer lexer = new RpgGramLexer(cs);

        // Criação do parser
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RpgGramParser parser = new RpgGramParser(tokens);
        
        // Parte repsonsavel pelo gerenciamento de erros no parser 
        ErrorListener el = new ErrorListener();
        parser.removeErrorListeners();
        parser.addErrorListener(el);
        
        // Parte reponsavem pela criacao de toda a parte semantica 
        ProgramaContext arvore = parser.programa();
        RPGSemantico as = new RPGSemantico();
        as.visitPrograma(arvore);        
        parser.programa();
        
        //Chamada para a gravação no documento externo
        File.gravaArquivo();           
    }
}