package com.itbootcamp.bgqa.nedelja5.dodatniZadaci.gradjevina;

public class Radnik implements Comparable<Radnik>{

    private int id;
    private String ime;
    private double plata;
    private int smena;


    public Radnik(int id, String ime, double plata, int smena) {
        this.id = id;
        this.ime = ime;
        this.plata = plata;
        this.smena = smena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public int getSmena() {
        return smena;
    }

    public void setSmena(int smena) {
        this.smena = smena;
    }
    void povisica(){

    }

    @Override
    public String toString() {
        return "Radnik{" +
                "id=" + id +
                ", ime='" + ime + '\'' +
                ", plata=" + plata +
                ", smena=" + smena +
                '}';
    }

    @Override
    public int compareTo(Radnik o) { //ovaj metod ima 3 rezultata: -1(ako je objekat sa kojim ga poredimo manji)
        if(this.id == o.id) {        // 0 ako je objekat sa kojim ga poredimo isti
            return 0;                            // 1 ako je objekat sa kojim ga poredimo vecireturn 0;
        }else{
            return -1;
        }
    }
}
