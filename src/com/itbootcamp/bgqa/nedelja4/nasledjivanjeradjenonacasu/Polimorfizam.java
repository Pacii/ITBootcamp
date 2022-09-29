package com.itbootcamp.bgqa.nedelja4.nasledjivanjeradjenonacasu;

public class Polimorfizam {
    public static void main(String[] args) {
        Radnici fizikalac =
                new Fizikalac("Zarko", "Zarkovic", 123, 1000, 0, 0, 10);

        Radnici menadzer =
                new Menadzer("Zarko", "Zarkovic", 123, 2000, 0, 0, 15);

        Radnici[] nizRadnika = new Radnici[2];
        nizRadnika[0] = fizikalac;
        nizRadnika[1] = menadzer;

        for (int i = 0; i < nizRadnika.length; i++) {
            nizRadnika[i].zdravo();
        }
    }
}
