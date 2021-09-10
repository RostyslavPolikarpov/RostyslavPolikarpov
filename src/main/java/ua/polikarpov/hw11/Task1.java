package ua.polikarpov.hw11;

public class Task1 {

    public static void main(String[] args) {
        for (PlanetEnum eP : PlanetEnum.values()) {
            System.out.println();
            System.out.printf("Number of satellite around %s is %s", eP, eP.getPlanetName());
        }
    }
}
