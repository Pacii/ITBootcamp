package com.itbootcamp.bgqa.nedelja5.dodatniZadaci.galerija;

import java.util.ArrayList;
import java.util.Collections;

public class Galerija {
    private ArrayList<Umetnik> umetnici;

    public Galerija(ArrayList<Umetnik> umetnici) {
        this.umetnici = umetnici;
    }

    public ArrayList<Umetnik> getUmetnici() {
        return umetnici;
    }

    public String umetnikNajstarijeDelo() {
        int najstarijeDelo = Integer.MAX_VALUE;
        String pobednik = "";
        for (Umetnik umetnik : umetnici) {
            for (UmetnickoDelo delo : umetnik.getUmetnickaDela()){
                if (delo.getGodinaNastanka() < najstarijeDelo){
                    najstarijeDelo = delo.getGodinaNastanka();
                    pobednik = umetnik.getIme();
                }
            }
        }
        return pobednik;
    }

    public double prosecnaVrednostSvihDela(){
        double sum = 0;
        int brojDela = 0;
        for (Umetnik umetnik : umetnici){
            brojDela += umetnik.getBrojUmetnickihDela();
            for (UmetnickoDelo delo : umetnik.getUmetnickaDela()){
                sum += delo.getCena();
            }
        }
        return sum/brojDela;
    }
    void sortiraj(){
        Collections.sort(umetnici);
    }
}
