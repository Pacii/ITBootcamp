package com.itbootcamp.bgqa.nedelja5.domaciSreda.Zadatak2;

import java.util.Arrays;

public class Restoran implements Guzva {
        private String naziv;
        private Jelo[] meni;
        private int brSlobodnihStolova;
        Restoran(String naziv, Jelo[] meni, int brSlobodnihStolova){
            this.naziv = naziv;
            this.meni = meni;
            this.brSlobodnihStolova = brSlobodnihStolova;
        }
        @Override
        public String jeloNajskuplje(Jelo[] meni){
            Jelo najskuplje = meni[0];
            for (Jelo jelo : meni){
                if (Double.compare(jelo.getCena(), najskuplje.getCena()) > 0){
                    najskuplje = jelo;
                }
            }
            return najskuplje.getNaziv();
        }
        public void rezervisiSto(){
            if (brSlobodnihStolova > 0){
                this.setBrSlobodnihStolova(brSlobodnihStolova-1);
            } else
                System.out.println("Zao nam je, trenutno nemamo slobodnih stolova.");
        }

        @Override
        public void stampajNaziveJela(String vrsta){
            for (Jelo jelo : meni){
                if (jelo.getVrsta().equalsIgnoreCase(vrsta)){
                    System.out.println(jelo.getNaziv());
                }
            }
        }
        public String getNaziv() {
            return naziv;
        }
        public void setNaziv(String naziv) {
            this.naziv = naziv;
        }
        public Jelo[] getMeni() {
            return meni;
        }
        public void setMeni(Jelo[] meni) {
            this.meni = meni;
        }
        public int getBrSlobodnihStolova() {
            return brSlobodnihStolova;
        }
        public void setBrSlobodnihStolova(int brSlobodnihStolova) {
            this.brSlobodnihStolova = brSlobodnihStolova;
        }
        @Override
        public String toString() {
            return "Restoran{" +
                    "naziv='" + naziv + '\'' +
                    ", meni=" + Arrays.toString(meni) +
                    ", brSlobodnihStolova=" + brSlobodnihStolova +
                    '}';
        }
    }
