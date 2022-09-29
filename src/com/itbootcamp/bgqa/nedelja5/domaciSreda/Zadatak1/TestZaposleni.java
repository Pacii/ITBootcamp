package com.itbootcamp.bgqa.nedelja5.domaciSreda.Zadatak1;

import java.util.ArrayList;

public class TestZaposleni {
    public static void main(String[] args) {
        ArrayList<Zaposleni> listaZaposlenih = new ArrayList<>();
        listaZaposlenih.add(
                new Konobari("Petar", "Konobar",
                        1991, 2500, 8, 1));
        listaZaposlenih.add(
                new Konobari("Milos", "Konobar",
                        1997, 2500, 8, 3));
        listaZaposlenih.add(
                new Konobari("Stefan", "Konobar",
                        1994, 2500, 8, 1));
        listaZaposlenih.add(
                new Konobari("Luka", "Konobar",
                        1991, 2500, 8, 2));
        listaZaposlenih.add(
                new Kuvari("Aleksandar", "Kuvar",
                        1991, 4000, 8, 2));
        listaZaposlenih.add(
                new Kuvari("Nemanja", "Kuvar",
                        1992, 4000, 8, 3));
        listaZaposlenih.add(
                new Kuvari("Ilija", "Kuvar",
                        1989, 4000, 8, 3));
        listaZaposlenih.add(
                new Kuvari("Zoran", "Kuvar",
                        1982, 4000, 8, 1));

        Restoran restoran = new Restoran(listaZaposlenih);
        System.out.println(restoran.stampajKonobare(3));
        restoran.povecajPlatuTrecojSmeni(listaZaposlenih);
        System.out.println(listaZaposlenih);

    }

    }

