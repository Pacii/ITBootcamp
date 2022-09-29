package com.itbootcamp.bgqa.nedelja5.AleksandarDjordjevic;

import java.util.ArrayList;
import java.util.Collections;

public class Poliklinika {

    public Poliklinika() {
        ArrayList<Lekar> sviLekari = Lekar.getSviLekari();
    }

    int pulmologSaNajmanjomPlatom(){
        int plata = Integer.MAX_VALUE;
        int lekarPlata = 0;
        for (Lekar pulmolog : Pulmolog.getSviLekari()){
            if (pulmolog.getClass().getSimpleName().equalsIgnoreCase("pulmolog") && pulmolog.plata() < plata){
                plata = (int) pulmolog.plata();
                lekarPlata = pulmolog.getId();
            }
        }
        return lekarPlata;
    }

    int pedijatarSaNajstarijimPacijentima(){
        int lekarPacijent = 0;
        int godineZaPoredjenje = 0;
        double prosekGodina = 0;
        for (Lekar pedijatar : Pedijatar.getSviLekari()){
            int godinePacijenta = 0;
            for (Pacijent pacijent : pedijatar.getPacijenti()){
                godinePacijenta += pacijent.getBrojGodina();
            }
            if (pedijatar.getClass().getSimpleName().equalsIgnoreCase("pedijatar") && godinePacijenta >= godineZaPoredjenje){
                prosekGodina = godinePacijenta/pedijatar.getBrojPacijenata();
                godineZaPoredjenje = godinePacijenta;
                lekarPacijent = pedijatar.getId();
            }
        }
        return lekarPacijent;
    }

    void sortLekariPoBrojuPacijenata(){
        Collections.sort(Lekar.getSviLekari());
    }
}
