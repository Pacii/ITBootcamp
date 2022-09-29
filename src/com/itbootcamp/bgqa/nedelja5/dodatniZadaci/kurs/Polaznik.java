package com.itbootcamp.bgqa.nedelja5.dodatniZadaci.kurs;

import java.util.ArrayList;

public class Polaznik {
    private String ime;
    private int godiste;

    public Polaznik(String ime, int godiste) {
        this.ime = ime;
        this.godiste = godiste;
    }

    public String getIme() {
        return ime;
    }

    public int getGodiste() {
        return godiste;
    }

    @Override
    public String toString() {
        return "Polaznik ime: " + ime +
                ", godiste: " + godiste;
    }
}
