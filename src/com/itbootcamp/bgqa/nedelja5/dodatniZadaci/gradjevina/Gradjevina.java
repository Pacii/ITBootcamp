package com.itbootcamp.bgqa.nedelja5.dodatniZadaci.gradjevina;

import java.util.ArrayList;

public class Gradjevina implements Posao{
    private ArrayList<Radnik> radnici = new ArrayList<>();

    public Gradjevina(ArrayList<Radnik> radnici) {
        this.radnici = radnici;
    }

    public ArrayList<Radnik> getRadnici() {
        return radnici;
    }

    public void setRadnici(ArrayList<Radnik> radnici) {
        this.radnici = radnici;
    }

    @Override
    public void dajOtkazPrvojSmeniFizikalaca() {
        for (int i=0; i<radnici.size(); i++) {  //prolazimo kroz listu radnika
       Radnik r = radnici.get(i);
       if (r instanceof Fizikalac && r.getSmena() == 1) {
           radnici.remove(radnici.get(i));
           }
        }
    }

    @Override
    public boolean jeRadnik(Radnik r) {
        //radnik rez = null;
        for (Radnik rad:radnici) {
            if (rad.compareTo(r) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double ukupnaPlataRadnikaDrugeSmene() {
        double suma = 0.0;
        for (Radnik r: radnici) {
            if (r.getSmena() == 2) {
                suma += r.getPlata();
            }
        }
        return suma;
    }

    @Override
    public ArrayList<Radnik> dobroPlaceni(double suma) {
        ArrayList<Radnik> novaLista = new ArrayList<>();
        for (Radnik r:radnici) {
            if (r.getPlata() > suma) {
                novaLista.add(r);
            }
        }
        return novaLista;
    }

    @Override
    public void sortirajPoPlati() {
        for (int i = 0; i < radnici.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < radnici.size(); j++) {
                if (radnici.get(minIndex).getPlata() > radnici.get(j).getPlata()) {
                    minIndex = j;
                }
                Radnik temp = radnici.get(minIndex);
                radnici.set(minIndex, radnici.get(i));
                radnici.set(i, temp);
            }
        }
    }

}
