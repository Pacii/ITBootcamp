package com.itbootcamp.bgqa.nedelja5.domaciSreda.Zadatak2;

public class Jelo {
    private String naziv;
    private double cena;
    private String vrsta;

    public Jelo(String naziv, double cena, String vrsta) {
        this.naziv = naziv;
        this.cena = cena;
        this.vrsta = vrsta;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCena() {
        return cena;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    @Override
    public String toString() {
        return "Jelo{" +
                "naziv='" + naziv + '\'' +
                ", cena=" + cena +
                ", vrsta='" + vrsta + '\'' +
                '}';
    }

}
