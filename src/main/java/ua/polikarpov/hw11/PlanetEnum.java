package ua.polikarpov.hw11;

public enum PlanetEnum {
    EARTH("1"), SATURN("82"), VENUS("0"), MARS("2");

    public String number;

    PlanetEnum(String number) {
        this.number = number;
    }

    public String getPlanetName() {
        return number;
    }
}
