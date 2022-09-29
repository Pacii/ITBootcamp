package com.itbootcamp.bgqa.nedelja5.dodatniZadaci.galerija;

import java.util.ArrayList;

public class UmetnickoDelo {
    private String naziv;
    private int godinaNastanka;
    private double cena;

    public UmetnickoDelo(String naziv, int godinaNastanka, double cena) {
        this.naziv = naziv;
        this.godinaNastanka = godinaNastanka;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getGodinaNastanka() {
        return godinaNastanka;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Naziv dela: " + naziv + ", godinaNastanka: " + godinaNastanka + ", cena: " + cena;
    }
}
