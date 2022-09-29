package com.itbootcamp.bgqa.nedelja5.dodatniZadaci.gradjevina;

import java.util.ArrayList;

public interface Posao {

    void dajOtkazPrvojSmeniFizikalaca();


    boolean jeRadnik(Radnik r);


    double ukupnaPlataRadnikaDrugeSmene();


    ArrayList<Radnik> dobroPlaceni(double suma);

    void sortirajPoPlati();
}