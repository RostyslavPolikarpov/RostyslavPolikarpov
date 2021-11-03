package ua.polikarpov.hw5.Task2;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        CheckArray check = new CheckArray();
        int[] array = {7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array));
        System.out.println(check.checkArray(array));
    }
}

