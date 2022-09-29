package com.itbootcamp.bgqa.nedelja5.domaciVikend;
import java.util.ArrayList;

public class TestProdavnica {
    public static void main(String[] args) {
        Namirnice n1 = new Namirnice("mleko", 150.99);
        Namirnice n2 = new Namirnice("secer", 70.99);
        Namirnice n3 = new Namirnice("ulje", 153.56);
        Namirnice n4 = new Namirnice("hleb", 56.70);

        ArrayList<Namirnice> namirnice = new ArrayList<>();

        Korpa korpa = new Korpa(namirnice);
        namirnice.add(n1);
        namirnice.add(n2);
        namirnice.add(n3);
        namirnice.add(n4);
        korpa.printNamirnice();
        System.out.println(korpa.jeNaspisku(n1));
        System.out.println(korpa.printRacun());

    }
}
