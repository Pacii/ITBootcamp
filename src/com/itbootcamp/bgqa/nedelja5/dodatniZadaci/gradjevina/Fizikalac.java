package com.itbootcamp.bgqa.nedelja5.dodatniZadaci.gradjevina;

public class Fizikalac extends Radnik {
    public Fizikalac(int id, String ime, double plata, int smena) {
        super(id, ime, plata, smena);
    }

    @Override
    public void povisica(){
        if(this.getSmena() == 2){
            setPlata(getPlata() + (getPlata() * 0.2));
        }
    }
}
