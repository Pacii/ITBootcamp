package com.itbootcamp.bgqa.nedelja4.domaci.zadatak1;

public class Jagoda extends Voce {
    public Jagoda (String ime, String sezona, double cenaZaKilogram, String boja){
    super(ime, sezona, cenaZaKilogram, boja);
}
    public boolean jeSezonaJagoda(String sezona) {
        sezona.equalsIgnoreCase(getSezona());
        boolean daLiJeSezona;
        if (sezona.equalsIgnoreCase("Sezona")){
            daLiJeSezona = true;
            System.out.println("Trenutno je sezona jagoda!");
        }
        else {
            daLiJeSezona = false;
            System.out.println("Trenutno nije sezona jagoda!");
        }
        return daLiJeSezona;
    }

    public double sumaVoca(double pare) {
        double kolicinaVocaUKilogramima = 0;
        double cenaKilograma = getCenaZaKilogram();
        kolicinaVocaUKilogramima = pare / cenaKilograma;

        return kolicinaVocaUKilogramima;
    }

    public void povecajCenuJagoda(String sezona){
        double cenaJagode = getCenaZaKilogram();
        if (jeSezonaJagoda(sezona) == false){
            cenaJagode += cenaJagode * 0.2;
            setCenaZaKilogram(cenaJagode);
        }
    }

    public static void main(String[] args) {
            Jagoda jagoda = new Jagoda("Jagoda", "nije sezona",200,"Crvena");

            System.out.println("Sa ovim novcem mozete kupiti: " + jagoda.sumaVoca(1000) + " KG.");
            System.out.println("Regularna cena jagoda je: " + jagoda.getCenaZaKilogram());
            jagoda.povecajCenuJagoda(jagoda.getSezona());
            System.out.println("Cena jagoda je: ");
            System.out.println(jagoda.getCenaZaKilogram());

        }
}