package org.java.exercise;

public class Aquila extends Animale implements Vola {

    private String habitat;
    private boolean addomesticata;

    public Aquila (String habitat, boolean addomesticata) {

        this.habitat = habitat;
        this.addomesticata = addomesticata;
    }

    @Override
    public void faiVerso() {
       System.out.println("Strido");
    }

    @Override
    public void mangia() {
        System.out.println("Carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!");
    }

}
