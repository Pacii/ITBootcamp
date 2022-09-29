package com.itbootcamp.bgqa.nedelja4.prodavnica;

public class Meso extends Roba {
    private double tezina; //tezina u gramima
    private String tip;

    public Meso(int barKod, double cena, String naziv, int popust, Prozvodjac prozvodjac, double tezina, String tip) {
        super(barKod, cena, naziv, popust, prozvodjac);
        this.tezina = tezina;
        this.tip = tip;
    }

    @Override
    public void obracunajCenu() {
        setCena(getCena() * tezina / Roba.faktorTezine);
    }

    public static void main(String[] args) {
        Roba juneceMeso =
                new Meso(123, 1000, "junetina", 0, new Prozvodjac(), 100.00, "smrznuto");
        juneceMeso.obracunajCenu();
        assert juneceMeso.getCena() == 100.00;
        System.out.println("Testovi prosli");
    }


    @Override
    public String toString() {
        return super.toString() +
                "tezina=" + tezina +
                ", tip='" + tip + '\n';
    }
}
