package com.itbootcamp.bgqa.nedelja5.dodatniZadaci.gradjevina;

    public class Masinovodja extends Radnik {
        public Masinovodja(int id, String ime, double plata, int smena) {
            super(id, ime, plata, smena);
        }

        @Override
        public void povisica(){
            if(this.getSmena() == 1){
                setPlata(getPlata() + (getPlata() * 0.25));
            }
        }
    }
