package com.itbootcamp.bgqa.nedelja4;

import java.util.Arrays;

public class Ucenik {
    private String ime;
    private String prezime;
    private int godine;
    private int[] ocene;


    public Ucenik(String ime, String prezime, int godine, int[] ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
        this.ocene = ocene;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodine() {
        return godine;
    }

    public int[] getOcene() {
        return ocene;
    }

    public void setPrezime(String novoPrezime) {
        prezime = novoPrezime;
    }

    public void setGodine() {
        godine = godine + 1;
    }

    public static String setOcene(int brojOcena, int[] ocene, int novaOcena) {
        {
            int i;
            int dodavanjeOcene[] = new int[brojOcena + 1];
            for (i = 0; i < brojOcena; i++) {
                dodavanjeOcene[i] = ocene[i];
                dodavanjeOcene[brojOcena] = novaOcena;
            }
            return Arrays.toString(dodavanjeOcene);
        }
    }

    public static String notifikacija(int[] ocene) {
        int brojacJedinica = 0;
        String obavestenje = "";
        for (int i = 0; i < ocene.length; i++) {
            if (ocene[i] == 1) {
                brojacJedinica++;
            } else if (ocene[i] <= 0 || ocene[i] > 5) {
                System.out.print("Ocena " + ocene[i] + " nije validna. Sve ocene moraju da budu validne!");
                return obavestenje;
            }
        }
        if (brojacJedinica == 1) {
            obavestenje = "Imate " + brojacJedinica + " jedinicu potrudite se da to popravite!";
        } else if (brojacJedinica >= 2 && brojacJedinica <= 4) {
            obavestenje = "Imate " + brojacJedinica + " jedinice potrudite se da to popravite!";
        } else if (brojacJedinica >= 5) {
            obavestenje = "Imate " + brojacJedinica + " jedinica potrudite se da to popravite!";
        } else {
            obavestenje = "Bravo! Nemate nijednu jedinicu!";
        }
        return obavestenje;
    }


    public static double prosek(int[] ocene) {
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < ocene.length; i++) {
            sum += ocene[i];
        }
        avg = sum / ocene.length;
        System.out.print("Prosek ocena je: ");
        return avg;
    }

    public static void main(String[] args) {

        Ucenik aleksandar = new Ucenik("Aleksandar", "Djordjevic", 24,new int[] {5,4,1,5});
        System.out.println(setOcene(4, new int[]{2, 5, 5, 5}, 5));
        System.out.println(notifikacija(new int[]{2, 3, 5}));
        System.out.println(prosek(new int[]{5, 4, 3, 5, 1}));

        System.out.println(aleksandar.setOcene(4, new int[]{5, 4, 1, 5}, 5));  //Ovo jedino ne funkcionise ne znam iz kog razloga
        System.out.println(notifikacija(aleksandar.getOcene()));
        System.out.println(prosek(aleksandar.getOcene()));
    }
}
