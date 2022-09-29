package com.itbootcamp.bgqa.nedelja5.domaciSreda.Zadatak1;

import java.util.ArrayList;

public class Restoran {
    public ArrayList<Zaposleni> zaposleni;

    public Restoran(ArrayList<Zaposleni> zaposleni) {
        this.zaposleni = zaposleni;
    }


    public ArrayList<Zaposleni> stampajKonobare(int nekaSmena) {
        ArrayList<Zaposleni> konobariUSmeni = new ArrayList<>();
        for (Zaposleni konobarUSmeni : this.zaposleni) {
            if (konobarUSmeni.getSmena() == nekaSmena && konobarUSmeni.getPozicija().equalsIgnoreCase("Konobar")) {
                konobariUSmeni.add(konobarUSmeni);
            }
        }
       return konobariUSmeni;
    }

    public void povecajPlatuTrecojSmeni(ArrayList<Zaposleni> zaposleni) {
        for (Zaposleni trecaSmena : this.zaposleni) {
            if (trecaSmena.getSmena() == 3) {
                int povecanjePlate = trecaSmena.getDnevnica();
                povecanjePlate += povecanjePlate * 0.3;
                trecaSmena.setDnevnica(povecanjePlate);
            }
        }
    }

}


