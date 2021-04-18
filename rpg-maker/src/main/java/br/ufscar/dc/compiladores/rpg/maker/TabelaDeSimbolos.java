package br.ufscar.dc.compiladores.rpg.maker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TabelaDeSimbolos {
    public enum Classe {
        ANIMAGO,
        ESPADACHIM,
        NECROMANTE,
        BARDO,
        PALADINO,
        INVALIDO
    }
    
    class EntradaTabelaDeSimbolos {
        String nome;
        Classe classe;
        boolean especial;
        List<String> encantamentos;
        int codigo;

        private EntradaTabelaDeSimbolos(String nome, Classe classe, boolean especial, int codigo) {
            this.nome = nome;
            this.classe = classe;
            this.especial = especial;
            this.encantamentos = new ArrayList<>();
            this.codigo = codigo;
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void add(String nome, Classe classe, String especial, int codigo) {
        if(especial.equals("sim"))
            tabela.put(nome, new EntradaTabelaDeSimbolos(nome, classe, true, codigo));
        else
            tabela.put(nome, new EntradaTabelaDeSimbolos(nome, classe, false, codigo));
    }
    
    public void addSpell(String nome, String encantamento) {
        tabela.get(nome).encantamentos.add(encantamento);
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public Classe verificar(String nome) {
        return tabela.get(nome).classe;
    }
    
    public boolean verificarStatus(String nome) {
        return tabela.get(nome).especial;
    }
    
    public int veriticarCodigo(String nome) {
        return tabela.get(nome).codigo;
    }
}