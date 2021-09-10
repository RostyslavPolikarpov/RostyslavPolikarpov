package ua.polikarpov.hw9.Planet;

public enum EnumPlanet {

    EARTH("1"), SATURN("82"), VENUS("0"), MARS("2");

    public String number;

    EnumPlanet(String number) {this.number = number;}

    public String getPlanetName() {return number;}
}
