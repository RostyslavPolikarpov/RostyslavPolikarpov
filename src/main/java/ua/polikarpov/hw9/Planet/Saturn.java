package ua.polikarpov.hw9.Planet;

import ua.polikarpov.hw9.Planet;

public class Saturn implements Planet {
    double accelerationOfGravity;

    Saturn() {

        this.accelerationOfGravity = 10.44; // m/(s * s)
    }

    @Override
    public void accelerationOfGravity() {
        System.out.println();
        System.out.println("Saturn");
        System.out.printf("Acceleration of gravity: %s m/s", accelerationOfGravity);
    }

    public void numberOfSatellites(int number) {
        if (number > 0) {
            System.out.printf("Number of satellite: %s", number);
        } else {
            System.out.println("Planet have not satellite");
        }
    }
}
