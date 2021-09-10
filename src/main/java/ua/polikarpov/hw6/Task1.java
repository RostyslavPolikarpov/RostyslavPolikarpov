package ua.polikarpov.hw6;

public class Task1 {

    public static void main(String[] args) {
// создание трёх экземпляров класса Phone и присвоение значений полям класса
        Phone phone1 = new Phone();
        phone1.number = +1069122;
        phone1.model = 5;
        phone1.weight = 150;
        phone1.receiveCall();
        phone1.getNumber(phone1.number);

        Phone phone2 = new Phone();
        phone2.number = +766895;
        phone2.model = 7;
        phone2.weight = 140;
        phone2.receiveCall();
        phone2.getNumber(phone2.number);

        Phone phone3 = new Phone();
        phone3.number = +3809958;
        phone3.model = 6;
        phone3.weight = 115;
        phone3.receiveCall();
        phone3.getNumber(phone3.number);

        System.out.println("Номер: " + phone1.number + "; модель: " + phone1.model + "; вес: " + phone1.weight);
        System.out.println("Номер: " + phone2.number + "; модель: " + phone2.model + "; вес: " + phone2.weight);
        System.out.println("Номер: " + phone3.number + "; модель: " + phone3.model + "; вес: " + phone3.weight);
    }
}

class Phone {

    int number;
    int model;
    int weight;

    Phone(int number, int model, int weight) {

    }

    Phone(int number, int model) {

    }

    Phone() {

    }

    void receiveCall() {
        System.out.println("Звонит Ростислав");
    }

    int getNumber(int number) {
        System.out.println(number);
        return number;
    }
}
