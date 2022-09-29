package com.itbootcamp.bgqa.nedelja5.dodatniZadaci.gradjevina;

import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        ArrayList <Radnik> radnici = new ArrayList<>();

        Radnik r1 = new Fizikalac(1505, "Petar", 20_000.0, 1);
        Radnik r2 = new SefSmene(1505, "Milan", 60_000.0, 1);
        Radnik r3 = new Masinovodja(1505, "Nemanja", 40_000.0, 1);
        Radnik r4 = new Fizikalac(1505, "Zoran", 25_000.0, 2);
        Radnik r5 = new Masinovodja(1505, "Milos", 40_000.0, 2);
        Radnik r6 = new Fizikalac(1505, "Strahinja", 23_000.0, 3);

        radnici.add(r1);
        radnici.add(r2);
        radnici.add(r3);
        radnici.add(r4);
        radnici.add(r5);
        radnici.add(r6);

   Gradjevina g = new Gradjevina(radnici);

        System.out.println("Pre povisice: " + radnici);

        for (Radnik r: radnici) {
            r.povisica();
        }

        System.out.println("Posle povisice: " + radnici);


        g.dajOtkazPrvojSmeniFizikalaca();
    }
}
