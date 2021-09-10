package ua.polikarpov.hw4;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        int[] number = new int[1000];

        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 1000 + 1);
        }

        System.out.println("Arrays: " + Arrays.toString(number));
        int amount = 0;
        for (int i = 0; i < number.length; i++) {
            if (compositeNumber(number[i])) {
                amount++;
                System.out.println("Composite number: " + number[i]);
            }
        }
        System.out.println("Quantity of composite numbers: " + amount);
    }

    private static boolean compositeNumber(int n) {
        int temp;
        if (n == 0) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            temp = n % i;
            if (temp == 0) {
                return true;
            }
        }
        return false;
    }

}