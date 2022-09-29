package com.itbootcamp.bgqa.nedelja5.dodatniZadaci.galerija;

import java.util.ArrayList;

public class Umetnik implements Comparable<Umetnik>{
    private int maksimalanBrojUmetnickihDela;
    private String ime;
    private ArrayList<UmetnickoDelo> umetnickaDela;
    private int brojUmetnickihDela;

    public Umetnik(String ime, ArrayList<UmetnickoDelo> umetnickaDela, int maksimalanBrojUmetnickihDela) {
        this.ime = ime;
        this.umetnickaDela = umetnickaDela;
        this.maksimalanBrojUmetnickihDela = maksimalanBrojUmetnickihDela;
        this.brojUmetnickihDela = umetnickaDela.size();
    }

    public int getMaksimalanBrojUmetnickihDela() {
        return maksimalanBrojUmetnickihDela;
    }

    public String getIme() {
        return ime;
    }

    public ArrayList<UmetnickoDelo> getUmetnickaDela() {
        return umetnickaDela;
    }

    public int getBrojUmetnickihDela() {
        return brojUmetnickihDela;
    }

    public void setBrojUmetnickihDela(int brojUmetnickihDela) {
        this.brojUmetnickihDela = brojUmetnickihDela;
    }

    public boolean izlozi (UmetnickoDelo d){
        if (brojUmetnickihDela < maksimalanBrojUmetnickihDela){
            umetnickaDela.add(d);
            setBrojUmetnickihDela(brojUmetnickihDela+1);
            return true;
        } else {
            return false;
        }
    }
    public double vrednost(){
        double sum = 0;
        for (UmetnickoDelo delo : umetnickaDela){
            sum+=delo.getCena();
        }
        return sum;
    }

    @Override
    public int compareTo(Umetnik o) {
        return Double.compare(this.vrednost(),o.vrednost());
    }

    @Override
    public String toString() {
        return System.lineSeparator() +  "Ime umetnika: " + ime + ", umetnickaDela: " + umetnickaDela + ", brojUmetnickihDela: " + brojUmetnickihDela;
    }
}
