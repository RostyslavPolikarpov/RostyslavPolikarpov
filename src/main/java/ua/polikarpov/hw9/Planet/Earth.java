package ua.polikarpov.hw9.Planet;

public class Earth implements Planet {
    double accelerationOfGravity;

    Earth() {
        this.accelerationOfGravity = 9.807; // m/(s * s)
    }

    @Override
    public void accelerationOfGravity() {
        System.out.println("Earth");
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

    public void numberOfArtificialSatellites(int number) {
        System.out.printf("Number of artificial satellites: %s", number);
    }
}
