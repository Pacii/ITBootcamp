package com.itbootcamp.bgqa.nedelja5.dodatniZadaci.kurs;

import java.util.ArrayList;

public class SkolaJezika implements Izmene{
    ArrayList<Kurs> listaKurseva;

    public SkolaJezika(ArrayList<Kurs> listaKurseva) {
        this.listaKurseva = listaKurseva;
    }

    public ArrayList<Kurs> getListaKurseva() {
        return listaKurseva;
    }

    @Override
    public String naprednijiJezik() {
        String imeKursa = "";
        int brojPolaznika = Integer.MIN_VALUE;
        for (Kurs kurs : listaKurseva){
            if (kurs.getNivo().equalsIgnoreCase("napredni") && kurs.polaznici().size() > brojPolaznika){
                brojPolaznika = kurs.polaznici().size();
                imeKursa = kurs.getJezik();
            }
        }
        return imeKursa;
    }

    @Override
//    za zadati jezik i nivo povecava nivo kursa za jedan stepen (osnovni u srednji, srednji u napredni). Ukoliko je zadati nivo napredni,
//    ili ne postoji kurs sa unetim parametrima, metoda ne radi nista.
//    Ukoliko nakon povecanja postoje dva kursa za isti jezik i nivo, potrebno je ispisati poruku da je potrebno spojiti te dve grupe.
    public void unaprediGrupu(String jezik, String nivo) {
        for (Kurs kurs : listaKurseva){
            if (kurs.getJezik().equalsIgnoreCase(jezik) && kurs.getNivo().equalsIgnoreCase(nivo)){
                if (kurs.getNivo().equalsIgnoreCase("srednji")){
                    kurs.setNivo("napredni");
                } else if (kurs.getNivo().equalsIgnoreCase("osnovni")){
                    kurs.setNivo("srednji");
                }
            }
        }
        for (int i = 0; i < listaKurseva.size(); i++) {
            for (int j = i; j < listaKurseva.size(); j++) {
                if (i!=j && listaKurseva.get(i).equals(listaKurseva.get(j))){
                    System.out.println("Treba spojiti: -> " + listaKurseva.get(i).toString() + " i " + listaKurseva.get(j).toString() + " <-");
                }
            }
        }
    }

    @Override
    public void ukloni(String jezik) {
        for (int i = 0; i < listaKurseva.size(); i++) {
            if (listaKurseva.get(i).getJezik().equalsIgnoreCase(jezik)){
                listaKurseva.remove(listaKurseva.get(i));
            }
        }
    }
}
