package ua.polikarpov.hw5;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] array = {16, 8, 4, 2, 1};
        System.out.println(Arrays.toString(array));
        System.out.println(checkArray(array));
    }

    public static boolean checkArray(int[] array) {
        boolean check = false;
        for (int i = 2; i < array.length; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}
