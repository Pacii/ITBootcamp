package com.itbootcamp.bgqa.nedelja4.domaci.zadatak2;

public class BMW extends Automobili {
    public BMW (String marka, String boja, int brojSasije, int godiste, int cena){
        super(marka, boja, brojSasije, godiste, cena);
    }
    public void oldTimerBMW(int godina) {
         godina = getGodiste();
        int goidsteAutomobila = 2022 - godina;
        int novaCena = getCena();
        if(goidsteAutomobila > 25) {
            novaCena -= novaCena * 0.3;
        }
        setCena(novaCena);
    }

    public static void main(String[] args) {
        BMW bmw = new BMW("BMW", "plava",23456,1992,10000);
        System.out.print("Cena automobila je: ");
        bmw.oldTimerBMW(bmw.getGodiste());
        System.out.println(bmw.getCena());
    }
      /*  Marko ostatak zadatka nisam uspeo da uradim. Nisam bio na predavanju u petak zbog problema sa strujom.
  U subotu sam imao proslavu 1. rodjendana sestricne. I nisam stigao da pogledam predavanje koje se odrzalo u petak.
   */
}