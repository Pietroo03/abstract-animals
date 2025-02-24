package org.java.exercise;

public class Passerotto extends Animale implements Vola{

    private float peso;

    public Passerotto(float peso) {

        this.peso = peso;
    }

    @Override
    public void faiVerso() {
        System.out.println("Pio Pio");
    }

    @Override
    public void mangia() {
        System.out.println("semi e bacche");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!");
    }

}
