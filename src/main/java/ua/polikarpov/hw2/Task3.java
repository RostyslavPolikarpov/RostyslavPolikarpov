package ua.polikarpov.hw2;

public class Task3 {

    public static void main(String[] args) {
        evenOddNumber(15);
    }

    public static int evenOddNumber(int a) {
        int b = a % 2;
        if ((b % 2) != 0) {
            System.out.print("The number is odd! Remainder is: " + b);
        } else {
            System.out.print("The number is even! Remainder is: " + b);
        }
        return b;
    }
}
