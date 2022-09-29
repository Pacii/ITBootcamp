package com.itbootcamp.bgqa.nedelja5.dodatniZadaci.kurs;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Polaznik prvi = new Polaznik("pera", 1995);
        Polaznik drugi = new Polaznik("zika", 1997);
        Polaznik treci = new Polaznik("mika", 1999);
        Polaznik cetvrti = new Polaznik("joca", 1985);
        Polaznik peti = new Polaznik("goca", 1989);
        Polaznik sesti = new Polaznik("zare", 1990);
        Polaznik sedmi = new Polaznik("mare", 1991);
        Polaznik osmi = new Polaznik("jole", 2002);
        Polaznik deveti = new Polaznik("bole", 1996);
        Polaznik deseti = new Polaznik("bole", 1996);

        ArrayList<Polaznik> prvaGrupa = new ArrayList<>(List.of(prvi, drugi, treci));
        ArrayList<Polaznik> drugaGrupa = new ArrayList<>(List.of(cetvrti, peti));
        ArrayList<Polaznik> trecaGrupa = new ArrayList<>(List.of(sesti, sedmi));
        ArrayList<Polaznik> cetvrtaGrupa = new ArrayList<>(List.of(osmi, deveti, deseti));

        Kurs engleski1 = new Kurs("engleski", "osnovni", prvaGrupa);
        Kurs engleski2 = new Kurs("engleski", "srednji", drugaGrupa);
        Kurs nemacki = new Kurs("nemacki", "napredni", trecaGrupa);
        Kurs engleski3 = new Kurs("spanski", "napredni", cetvrtaGrupa);

        ArrayList<Kurs> kurs = new ArrayList<>(List.of(engleski1,engleski2,engleski3,nemacki));

        SkolaJezika skolaJezika = new SkolaJezika(kurs);

        System.out.println(skolaJezika.naprednijiJezik());

        skolaJezika.unaprediGrupu("engleski", "osnovni");

        System.out.println(skolaJezika.getListaKurseva().toString());
        skolaJezika.ukloni("nemacki");
        System.out.println(skolaJezika.getListaKurseva().toString());
    }
}