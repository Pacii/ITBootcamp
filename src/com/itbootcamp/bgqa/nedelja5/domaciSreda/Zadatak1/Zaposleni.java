package com.itbootcamp.bgqa.nedelja5.domaciSreda.Zadatak1;

public class Zaposleni {
    private String ime;
    private String pozicija;
    private int godiste;
    private int dnevnica;
    private int sati;  //gledamo sate kao celebrojne tipove(okrugao sat), bez gledanja minuta
    private int smena; //smena moze biti prva druga ili treca, prva je od 7-15, druga je od 15-23 i treca od 23-7



    public Zaposleni(String ime, String pozicija, int godiste, int dnevnica, int sati, int smena) {
        this.ime = ime;
        this.pozicija = pozicija;
        this.godiste = godiste;
        this.dnevnica = dnevnica;
        this.sati = sati;
        this.smena = smena;
    }



    public String getIme() {
        return ime;
    }

    public String getPozicija() {
        return pozicija;
    }

    public int getGodiste() {
        return godiste;
    }

    public int getDnevnica() {
        return dnevnica;
    }

    public int getSati() {
        return sati;
    }

    public int getSmena() {
        return smena;
    }

    public void setDnevnica(int dnevnica) {
        this.dnevnica = dnevnica;
    }

    public void setSati(int sati) {
        this.sati = sati;
    }

    public void setSmena(int smena) {
        this.smena = smena;
    }



    @Override
    public String toString() {
        return "Zaposleni{" +
                "ime='" + ime + '\'' +
                ", pozicija='" + pozicija + '\'' +
                ", godiste=" + godiste +
                ", dnevnica=" + dnevnica +
                ", sati=" + sati +
                ", smena=" + smena +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (!(object instanceof Zaposleni)) {
            return false;
        }

        Zaposleni zaposleni = (Zaposleni) object;

        return this.getIme().equals(zaposleni.getIme()) &&
                this.getPozicija().equals(zaposleni.getPozicija()) &&
                this.getGodiste() == zaposleni.getGodiste() &&
                this.getDnevnica() == zaposleni.getDnevnica() &&
                this.getSati() == zaposleni.getSati() &&
                this.getSmena() == zaposleni.getSmena();
    }

}
