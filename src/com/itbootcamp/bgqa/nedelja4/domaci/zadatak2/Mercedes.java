package com.itbootcamp.bgqa.nedelja4.domaci.zadatak2;

public class Mercedes extends Automobili {
        public Mercedes (String marka, String boja, int brojSasije, int godiste, int cena){
            super(marka, boja, brojSasije, godiste, cena);
        }
    public void oldTimerMercedes(int godina) {
        godina = getGodiste();
        int goidsteAutomobila = 2022 - godina;
        int novaCena = getCena();
        if(goidsteAutomobila > 25) {
            novaCena -= novaCena * 0.3;
        }
        setCena(novaCena);
    }
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes("Mercedes", "zuta",232156,2001,10000);
        System.out.print("Cena automobila je: ");
        mercedes.oldTimerMercedes(mercedes.getGodiste());
        System.out.println(mercedes.getCena());
    }
    }
  /*  Marko ostatak zadatka nisam uspeo da uradim. Nisam bio na predavanju u petak zbog problema sa strujom.
  U subotu sam imao proslavu 1. rodjendana sestricne. I nisam stigao da pogledam predavanje koje se odrzalo u petak.
   */