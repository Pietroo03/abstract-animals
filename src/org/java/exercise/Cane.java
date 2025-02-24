package org.java.exercise;

public class Cane extends Animale implements Nuota{

    private String colorePelo;
    private String taglia;

    public Cane(String colorePelo, String taglia) {

        this.colorePelo = colorePelo;
        this.taglia = taglia;
    }

    @Override
    public void faiVerso() {
        System.out.println("Bau Bau");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia principalmente carne");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!");
    }


}
