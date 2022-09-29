package com.itbootcamp.bgqa.nedelja5.AleksandarDjordjevic;

import java.util.ArrayList;

public class Pacijent {
    private String ime, prezime;
    private int brojGodina;
    private static ArrayList<Pacijent> sviPacijenti = new ArrayList<>();

    public Pacijent(String ime, String prezime, int brojGodina) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojGodina = brojGodina;
        sviPacijenti.add(this);
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojGodina() {
        return brojGodina;
    }

    public static ArrayList<Pacijent> getSviPacijenti() {
        return sviPacijenti;
    }

    @Override
    public String toString() {
        return "Podaci pacijenta -> ime: " + ime + ", prezime='" + prezime + ", brojGodina: " + brojGodina;
    }
}
