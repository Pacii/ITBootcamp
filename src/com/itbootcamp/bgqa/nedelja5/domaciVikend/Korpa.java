package com.itbootcamp.bgqa.nedelja5.domaciVikend;

import java.util.ArrayList;

public class Korpa implements Racun {
    private ArrayList<Namirnice> namirnice;

    public Korpa(ArrayList<Namirnice> namirnice) {
        this.namirnice = namirnice;
    }

    public ArrayList<Namirnice> getNamirnice() {
        return namirnice;
    }

    @Override
    public void printNamirnice() {
        for (int i = 0; i < namirnice.size(); i++) {
            System.out.println(namirnice.get(i));
        }
    }

    @Override
    public int printRacun() {

        double suma = 0;
        for (int i = 0; i < namirnice.size(); i++) {
            suma += namirnice.get(i).getCena();

        }
        return (int) suma;
    }

    @Override
    public boolean jeNaspisku(Namirnice n) {

        boolean vredsnost = false;

        for (Namirnice nam : namirnice) {
            if (nam.getNaziv().equalsIgnoreCase(n.getNaziv())) {

                vredsnost = true;
            }
        }
        return vredsnost;
    }

}
