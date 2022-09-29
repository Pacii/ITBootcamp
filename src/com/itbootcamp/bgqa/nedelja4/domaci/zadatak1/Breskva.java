package com.itbootcamp.bgqa.nedelja4.domaci.zadatak1;

public class Breskva extends Voce {
        public Breskva (String ime, String sezona, double cenaZaKilogram, String boja){
            super(ime, sezona, cenaZaKilogram, boja);
        }
    public double sumaVoca(double pare) {
        double kolicinaVocaUKilogramima = 0;
        double cenaKilograma = getCenaZaKilogram();
        kolicinaVocaUKilogramima = pare / cenaKilograma;

        return kolicinaVocaUKilogramima;
    }
    public boolean jeSezonaBreskve(String sezona) {
        sezona.equalsIgnoreCase(getSezona());
        boolean daLiJeSezona;

        if (sezona.equalsIgnoreCase("Sezona")){
            daLiJeSezona = true;
            System.out.println("Trenutno je sezona breskvi!");
        }
        else {
            daLiJeSezona = false;
            System.out.println("Trenutno nije sezona breskvi!");
        }
        return daLiJeSezona;
    }

    public void smanjiCenuBreskvi(String boja) {
        double cenaBreskve = getCenaZaKilogram();
            if (boja.equalsIgnoreCase("ZELENA")){
               cenaBreskve -= cenaBreskve * 0.15;
               setCenaZaKilogram(cenaBreskve);
          }
    }

    public static void main(String[] args) {
        Breskva breskva = new Breskva("Breskva", "Sezona",140,"Zelena");

        System.out.println("Sa ovim novcem mozete kupiti: " + breskva.sumaVoca(1000) + " KG.");
        System.out.println("Regularna cena breskve je: " + breskva.getCenaZaKilogram());
        System.out.print("Cena zelenih breskvi je: ");
        breskva.smanjiCenuBreskvi(breskva.getBoja());
        System.out.println(breskva.getCenaZaKilogram());
        System.out.println(breskva.jeSezonaBreskve("sad"));
    }
}