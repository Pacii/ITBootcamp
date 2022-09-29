package com.itbootcamp.bgqa.nedelja5.AleksandarDjordjevic;

import java.util.ArrayList;

public class Pulmolog extends Lekar {
    public Pulmolog(int id, String ime, String prezime, ArrayList<Pacijent> pacijenti, int brojPacijenata) {
        super(id, ime, prezime, pacijenti, brojPacijenata);
    }

    @Override
    boolean prihvati(Pacijent p) {
        boolean prihvacen = false;
        if (brojPacijenata < 100){
            prihvacen = true;
            setBrojPacijenata(getBrojPacijenata()+1);
        }
        return prihvacen;
    }

    @Override
    double plata() {
        return brojPacijenata * 350;
    }
}
