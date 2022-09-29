package com.itbootcamp.bgqa.nedelja4.domaci.zadatak1;

public class Voce {
    private String ime;
    private String sezona;
    private double cenaZaKilogram;
    private String boja;

    public Voce(String ime, String sezona, double cenaZaKilogram, String boja) {
        this.ime = ime;
        this.sezona = sezona;
        this.cenaZaKilogram = cenaZaKilogram;
        this.boja = boja;
    }

    public String getIme() {
        return ime;
    }

    public String getSezona() {
        return sezona;
    }

    public double getCenaZaKilogram() {
        return cenaZaKilogram;
    }

    public String getBoja() {
        return boja;
    }

    public void setSezona(String sezona) {
        this.sezona = sezona;
    }

    public void setCenaZaKilogram(double cenaZaKilogram) {
        this.cenaZaKilogram = cenaZaKilogram;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

}
