package com.itbootcamp.bgqa.nedelja5.dodatniZadaci.kurs;

import java.util.ArrayList;

public class Kurs {
    private String jezik;
    private String nivo;
    private ArrayList<Polaznik> polaznici;

    public Kurs(String jezik, String nivo, ArrayList<Polaznik> polaznici) {
        this.jezik = jezik;
        this.nivo = nivo;
        this.polaznici = polaznici;
    }

    public ArrayList<Polaznik> getPolaznici() {
        return polaznici;
    }

    public String getJezik() {
        return jezik;
    }

    public String getNivo() {
        return nivo;
    }

    public ArrayList<Polaznik> polaznici() {
        return polaznici;
    }

    public void setNivo(String nivo) {
        if (nivo.equalsIgnoreCase("napredni") || nivo.equalsIgnoreCase("srednji")){
            this.nivo = nivo;
        } else {
            this.nivo = "osnovni";
        }
    }

    @Override
    public String toString() {
        return System.lineSeparator() + "Jezik: " + jezik + ", nivo: " + nivo + ", sviPolaznici: " + polaznici.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kurs)) return false;

        Kurs kurs = (Kurs) o;

        if (getJezik() != null ? !getJezik().equals(kurs.getJezik()) : kurs.getJezik() != null) return false;
        return getNivo() != null ? getNivo().equals(kurs.getNivo()) : kurs.getNivo() == null;
    }
}
