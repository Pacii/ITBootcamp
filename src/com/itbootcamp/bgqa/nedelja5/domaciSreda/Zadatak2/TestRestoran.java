package com.itbootcamp.bgqa.nedelja5.domaciSreda.Zadatak2;

import java.util.Arrays;

public class TestRestoran {
    public static void main(String[] args) {
       Jelo[] meni;
        meni = new Jelo[6];

        meni[0] = new Jelo("Mexicana", 350,"Italijanska");
        meni[1] = new Jelo("Napolitana", 400,"Italijanska");
        meni[2] = new Jelo("Sarma", 350,"Srpska");
        meni[3] = new Jelo("Karadjordjeva snicla", 600,"Srpska");
        meni[4] = new Jelo("Giros", 400,"Grcka");
        meni[5] = new Jelo("Americke palacinke", 300,"Americka");

    Restoran restoran = new Restoran("Perla", meni, 5);
        System.out.println(restoran.jeloNajskuplje(meni));
        restoran.rezervisiSto();
        System.out.println(restoran);
        restoran.stampajNaziveJela("Srpska");
    }

}
