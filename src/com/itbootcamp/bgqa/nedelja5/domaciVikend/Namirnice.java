package com.itbootcamp.bgqa.nedelja5.domaciVikend;

public class Namirnice {
    private String naziv;
    private double cena;

    public Namirnice(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
    @Override
    public String toString() {
        return "Namirnice{" +
                "naziv='" + naziv + '\'' +
                ", cena=" + cena +
                '}';
    }
}

