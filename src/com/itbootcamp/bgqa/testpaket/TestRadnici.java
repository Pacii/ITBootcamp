package com.itbootcamp.bgqa.nedelja4;

public class TestRadnici {
    public static void main(String[] args) {
        //region Test racunaj radni staz
        Radnik radnik1 = new Radnik(1, "Pera", "Fizikalac", 2000, 10000);
        int ocekivaniRadniStaz = 22;
        assert radnik1.racunajRadniStaz() == ocekivaniRadniStaz;

        Radnik radnik2 = new Radnik(1, "Pera", "Fizikalac", 2022, 10000);
        ocekivaniRadniStaz = 0;
        assert radnik2.racunajRadniStaz() == ocekivaniRadniStaz;

        Radnik radnik3 = new Radnik(1, "Pera", "Fizikalac", 2023, 10000);

        assert radnik3.racunajRadniStaz() >= 0;
        //endregion

        System.out.println("Testovi prosli");
    }
}
