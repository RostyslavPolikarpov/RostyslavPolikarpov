package ua.polikarpov.hw4;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int[] array = new int[2000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 2000 + 1);
        }
        System.out.println("Array: " + Arrays.toString(array));
        changeNumbersToZero(array);
    }

    public static void changeNumbersToZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                array[i] = 0;
            }
        }
        System.out.println("New array: " + Arrays.toString(array));
    }
}

