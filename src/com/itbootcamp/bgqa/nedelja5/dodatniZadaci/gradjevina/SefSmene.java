package com.itbootcamp.bgqa.nedelja5.dodatniZadaci.gradjevina;

public class SefSmene extends Radnik {
    public SefSmene(int id, String ime, double plata, int smena) {
        super(id, ime, plata, smena);
    }

    @Override
    public void povisica(){ //proveravamo koje je sef smena
        if(this.getSmena() == 3){
            setPlata(getPlata() + (getPlata() * 0.3)) ;
        }

    }
}
