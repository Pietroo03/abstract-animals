package org.java.exercise;

public class Main {

    public static void faiVolare(Vola animale) {
        animale.vola();
    }

    public static void faiNuotare(Nuota animale) {
        animale.nuota();
    }

    public static void main(String[] args) {
        
        Cane fuffi = new Cane("marrone", "media");
        Passerotto passerotto = new Passerotto(20.5f);
        Aquila aquilaReale = new Aquila("montagne", false);
        Delfino piccoloDelfino = new Delfino("Willy", true);

        fuffi.faiVerso();
        passerotto.faiVerso();
        aquilaReale.faiVerso();
        piccoloDelfino.faiVerso();

        fuffi.mangia();
        passerotto.mangia();
        aquilaReale.mangia();
        piccoloDelfino.mangia();

        fuffi.dormi();
        passerotto.dormi();
        aquilaReale.dormi();
        piccoloDelfino.dormi();

        faiNuotare(piccoloDelfino);
        faiVolare(aquilaReale);
    }
}
