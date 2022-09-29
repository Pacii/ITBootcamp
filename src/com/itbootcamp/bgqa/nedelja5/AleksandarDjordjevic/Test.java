/*package com.itbootcamp.bgqa.nedelja5.AleksandarDjordjevic;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Pacijent paki = new Pacijent("Pera", "Peric", 75);
        Pacijent paci = new Pacijent("Laza", "Lazic", 80);
        Pacijent baki = new Pacijent("Baki", "Bakic", 90);
        Pacijent raki = new Pacijent("Raka", "Rakic", 77);

        ArrayList<Pacijent> prviPacijenti = new ArrayList<>(List.of(paki, paci));
        ArrayList<Pacijent> drugiPacijenti = new ArrayList<>(List.of(baki,raki));
        Pedijatar prvi = new Pedijatar(1,"Petar","Petrovic",prviPacijenti,2);
        Pedijatar drugi = new Pedijatar(2,"Marko","Markovic", drugiPacijenti, 2);

       // ArrayList<Pacijent> prviPulmolog = new ArrayList<>(List.of(paki,paci,baki));
       // ArrayList<Pacijent> drugiPulmolog = new ArrayList<>(List.of(raki));
      //  Pulmolog jedan = new Pulmolog(3,"Nesa", "Nesic", prviPulmolog,3);
      //  Pulmolog dva = new Pulmolog(4,"Mesa", "Mesic", drugiPulmolog, 1);

        for (Lekar lekari : Lekar.getSviLekari()){
            System.out.println(lekari.getId() + ". " + lekari.plata());
        }

        Poliklinika jedina = new Poliklinika();
        System.out.println("Najmanja plata: " + jedina.pulmologSaNajmanjomPlatom());
        System.out.println("Najstariji pacijenti: " + jedina.pedijatarSaNajstarijimPacijentima());
        System.out.println(prvi.getSviLekari().toString());
        jedina.sortLekariPoBrojuPacijenata();
        System.out.println(Lekar.getSviLekari().toString());
    }
}*/