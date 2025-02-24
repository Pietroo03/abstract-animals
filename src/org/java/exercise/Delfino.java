package org.java.exercise;

public class Delfino extends Animale implements Nuota {

    private String nome;
    private boolean alloZoo;

    public Delfino(String nome, boolean alloZoo) {

        this.nome = nome;
        this.alloZoo = alloZoo;
    }

    @Override
    public void faiVerso() {
        System.out.println("scoppietta");
    }

    @Override
    public void mangia() {
        System.out.println("piccoli pesci");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!");
    }

}
