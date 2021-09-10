package ua.polikarpov.hw9.Planet;

import ua.polikarpov.hw9.Planet;

public class Mars implements Planet {
    double accelerationOfGravity = 3.711; // m/(s * s)

    @Override
    public void accelerationOfGravity() {
        System.out.println();
        System.out.println("Mars");
        System.out.printf("Acceleration of gravity: %s m/s", accelerationOfGravity);
    }

    public boolean atmosphere() {
        boolean presence = true;
        String atmosphere = presence ? "Planet have atmosphere" : "Planet have not atmosphere";
        System.out.println(atmosphere);
        return true;
    }

    public void numberOfSatellites(int number) {
        if (number > 0) {
            System.out.printf("Number of satellite: %s", number);
        } else {
            System.out.println("Planet have not satellite");
        }
    }
}
