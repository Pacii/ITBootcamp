package com.itbootcamp.bgqa.nedelja5.AleksandarDjordjevic;

import java.util.ArrayList;

public abstract class Lekar implements Comparable<Lekar> {
    private int id;
    private String ime, prezime;
    private ArrayList<Pacijent> pacijenti;
    int brojPacijenata;
    private static ArrayList<Lekar> sviLekari = new ArrayList<>();

    public Lekar(int id, String ime, String prezime, ArrayList<Pacijent> pacijenti, int brojPacijenata) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.pacijenti = Pacijent.getSviPacijenti();
        this.brojPacijenata = brojPacijenata;
        sviLekari.add(this);
    }

    //region getteri
    public static ArrayList<Lekar> getSviLekari() {
        return sviLekari;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public ArrayList<Pacijent> getPacijenti() {
        return pacijenti;
    }

    public int getBrojPacijenata() {
        return brojPacijenata;
    }
    //endregion

    public void setBrojPacijenata(int brojPacijenata) {
        this.brojPacijenata = brojPacijenata;
    }

    @Override
    public int compareTo(Lekar lekar) {
        return lekar.getBrojPacijenata() - this.brojPacijenata;
    }

    abstract boolean prihvati(Pacijent p);
    abstract double plata();

    @Override
    public String toString() {
        return System.lineSeparator() + "Podaci lekara id: "+ id + ", ime='" + ime + ", prezime='" + prezime + ", brojPacijenata=" + brojPacijenata;
    }
}
