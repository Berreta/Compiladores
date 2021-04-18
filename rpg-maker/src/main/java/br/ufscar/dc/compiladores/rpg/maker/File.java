package br.ufscar.dc.compiladores.rpg.maker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class File {

    public static StringBuffer sb = new StringBuffer();
    public static String pf; // variavel para guardar o caminho do arquivo
    
    // Lista que separa cada div pelo personagem correto
    public static List<String> divCharacter = new ArrayList<String>();

    public static void AddString(String str) {
        sb.append(str).append("\n");
    }

    public static String getText() {
        return sb.toString();
    }

    // Geracao de codigo
    // A classe criaArquivo cria a parte inicial do codigo html juntamento com o estilo
    public static void criaArquivo(String caminho) {
        pf = caminho;
        sb.append("<html>\n" +
                "    <head>\n" +
                "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "        <title>RPG Maker</title>\n" +
                "        <style type=\"text/css\">\n" +
                "            body {\n" +
                "                background-image: url('https://i.imgur.com/G5BuFTV.png');\n" +
                "            }\n" +                                
                "            h1 {\n" +
                "                text-align: center;\n" +
                "                color: #fff;\n" +
                "                font-family: sans-serif;\n" +
                "                font-weight: bold; \n" +
                "            }"+
                "            td {\n" +
                "                vertical-align: top;\n" +
                "            }\n" +
                "            #box {\n" +
                "                width: 300px;\n" +
                "                min-height: 400px;\n" +
                "                max-height: 1000px;\n" +
                "                border-style: solid;\n" +
                "                border-color: #A0522D;\n" +
                "                border-width: thin;\n" +
                "                border-radius: 10px;\n" +
                "                margin: 10px;\n" +
                "                padding: 10px;\n" +
                "                text-align: center;\n" +
                "                color: #CD853F;\n" +
                "                font-family: sans-serif;\n" +
                "                font-weight: bold;\n" +
                "                background-color: #F5F5DC;\n" +
                "            }\n" +
                "\n" +
                "            #erros {\n" +
                "                margin: 0 auto;\n" +
                "                border-style: solid;\n" +
                "                border-color: #A0522D;\n" +
                "                border-width: thin;\n" +
                "                border-radius: 10px;\n" +
                "                margin: 10px;\n" +
                "                padding: 10px;\n" +
                "                text-align: center;\n" +
                "                color: #EE0000;\n" +
                "                font-family: sans-serif;\n" +
                "                font-weight: bold;\n" +
                "                background-color: #F5F5DC;\n" +
                "            }\n" +
                "\n" +
                "            .tooltip {\n" +
                "                position: relative;\n" +
                "                display: inline-block;\n" +
                "                cursor: help;\n" +
                "            }\n" +
                "\n" +
                "            .tooltip .tooltiptext {\n" +
                "                visibility: hidden;\n" +
                "                width: 120px;\n" +
                "                text-align: center;\n" +
                "                border-radius: 6px;\n" +
                "                padding: 5px 0;\n" +
                "                position: absolute;\n" +
                "                z-index: 1;\n" +
                "                top: -5px;\n" +
                "                left: 105%;\n" +
                "            }\n" +
                "\n" +
                "            .tooltip:hover .tooltiptext {\n" +
                "                visibility: visible;\n" +
                "            }\n" +
                "        </style>\n" +
                "    </head>\n" +
                "         \n" +
                "    <body>\n" +
                "<h1>RPG Maker</h1>" +
                "        <table>\n" +
                "            <tr>\n");
    }
    
    // Criacao da div do personagem
    public static void addDiv(String info) {
        divCharacter.add(info);
    }
        
    // Concatena div de um personagem
    public static void appendDiv(int codigo, String infoNova) {
        String infoAnterior = divCharacter.get(codigo);
        String infoConcat = infoAnterior.concat(infoNova);
        divCharacter.set(codigo, infoConcat);
    }

    // Grava todas as info concatenadas no arquivo de saida
    public static void gravaArquivo() {
        for(int i = 0; i < divCharacter.size(); i++) {
            appendDiv(i, "                </td></div>\n\n");
            sb.append(divCharacter.get(i));
        }
        
        sb.append("            </tr>\n" +
                "        </table>\n" +
                "    </body>\n" +
                "</html>");

        try {
            Files.writeString(Paths.get(pf), getText());
        } catch (IOException e) {
        }
        System.exit(0);
    }
}
