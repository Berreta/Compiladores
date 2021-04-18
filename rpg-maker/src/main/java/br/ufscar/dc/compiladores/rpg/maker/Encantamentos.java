package br.ufscar.dc.compiladores.rpg.maker;

import java.util.HashMap;

public class Encantamentos {
    
    private final HashMap<String, Integer> LivroDeEncantamentos;
    
    public Encantamentos() {
        this.LivroDeEncantamentos = new HashMap<>();
    }
    
    public int getMana(String nome) {
        return LivroDeEncantamentos.get(nome);
    }
    
    public boolean existe(String nome) {
        return LivroDeEncantamentos.containsKey(nome);
    }    
    
    public void initLivroDeEncantamentos() {
        
        //encantamentos Animago
        LivroDeEncantamentos.put("CuraAnimago", 100);        
        LivroDeEncantamentos.put("AtaqueAnimago", 350);
        LivroDeEncantamentos.put("FugaAnimago", 50);
        LivroDeEncantamentos.put("DefesaAnimago", 180);

        //encantamentos Espadachim
        LivroDeEncantamentos.put("CuraEspadachim", 100);        
        LivroDeEncantamentos.put("AtaqueEspadachim", 350);
        LivroDeEncantamentos.put("FugaEspadachim", 50);
        LivroDeEncantamentos.put("DefesaEspadachim", 180);
        
        //encantamentos Necromante
        LivroDeEncantamentos.put("CuraNecromante", 100);        
        LivroDeEncantamentos.put("AtaqueNecromante", 350);
        LivroDeEncantamentos.put("FugaNecromante", 50);
        LivroDeEncantamentos.put("DefesaNecromante", 180);        
        
        //encantamentos Bardo
        LivroDeEncantamentos.put("CuraBardo", 100);        
        LivroDeEncantamentos.put("AtaqueBardo", 350);
        LivroDeEncantamentos.put("FugaBardo", 50);
        LivroDeEncantamentos.put("DefesaBardo", 180);
        
        //encantamentos Paladino
        LivroDeEncantamentos.put("CuraPaladino", 100);        
        LivroDeEncantamentos.put("AtaquePaladino", 350);
        LivroDeEncantamentos.put("FugaPaladino", 50);
        LivroDeEncantamentos.put("DefesaPaladino", 180);               
    }
}
