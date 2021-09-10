package ua.polikarpov.hw9.Planet;

public class Task1 {

    public static void main(String[] args) {
        Earth earth = new Earth();
        earth.accelerationOfGravity();
        System.out.println();
        earth.atmosphere();
        earth.numberOfSatellites(1);
        System.out.println();
        earth.numberOfArtificialSatellites(8300);

        System.out.println();
        Saturn saturn = new Saturn();
        saturn.accelerationOfGravity();
        System.out.println();
        saturn.numberOfSatellites(82);

        System.out.println();
        Venus venus = new Venus();
        venus.accelerationOfGravity();
        System.out.println();
        venus.atmosphere();
        venus.numberOfSatellites(0);

        Mars mars = new Mars();
        mars.accelerationOfGravity();
        System.out.println();
        mars.atmosphere();
        mars.numberOfSatellites(2);
    }
}
