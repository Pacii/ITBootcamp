package com.itbootcamp.bgqa.nedelja5.dodatniZadaci.galerija;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        UmetnickoDelo prvo = new UmetnickoDelo("Delo", 1999, 115.5);
        UmetnickoDelo drugo = new UmetnickoDelo("Delo", 2019, 110);
        UmetnickoDelo trece = new UmetnickoDelo("Delo", 1999, 129.99);
        UmetnickoDelo cetvrto = new UmetnickoDelo("Delo", 2022, 50);
        UmetnickoDelo peto = new UmetnickoDelo("Delo", 1988, 250.99);
        UmetnickoDelo sesto = new UmetnickoDelo("Delo", 1999, 49);
        UmetnickoDelo sedmo = new UmetnickoDelo("Delo", 1999, 25);
        UmetnickoDelo osmo = new UmetnickoDelo("Delo", 1999, 30);

        ArrayList<UmetnickoDelo> prvi = new ArrayList<>(List.of(prvo, drugo));
        ArrayList<UmetnickoDelo> drugi = new ArrayList<>(List.of(trece, cetvrto, peto, sesto));
        ArrayList<UmetnickoDelo> treci = new ArrayList<>(List.of(sedmo, osmo));

        Umetnik prviUmetnik = new Umetnik("Pera", prvi, 3);
        Umetnik drugiUmetnik = new Umetnik("Zika", drugi, 4);
        Umetnik treciUmetnik = new Umetnik("Mika", treci, 5);

        ArrayList<Umetnik> sviUmetnici = new ArrayList<>(List.of(prviUmetnik, drugiUmetnik, treciUmetnik));

        Galerija galerija = new Galerija(sviUmetnici);

        System.out.println("Prosecna vrednost svih dela je: " + galerija.prosecnaVrednostSvihDela());
        System.out.println("Umetnik sa najstarijim delom je: " + galerija.umetnikNajstarijeDelo());
        System.out.println("Pre sortiranja: " + galerija.getUmetnici().toString());
        galerija.sortiraj();
        System.out.println("Posle sortiranja:" + galerija.getUmetnici().toString());

        System.out.println(prviUmetnik.izlozi(new UmetnickoDelo("Knjiga", 1995, 100)));
        System.out.println(drugiUmetnik.izlozi(new UmetnickoDelo("Knjiga", 1995, 100)));
    }
}