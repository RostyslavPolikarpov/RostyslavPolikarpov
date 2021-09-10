package ua.polikarpov.hw5;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printArray(array);
        System.out.println();
        int[][] newArray = flipColumns(array);
        printArray(newArray);
    }

    private static int[][] flipColumns(int[][] array) {
        int[][] newArray = new int[array[0].length][array.length];
        int counter = 0;
        for (int[] index : array) {
            for (int i = 0; i < index.length; i++) {
                newArray[i][counter] = index[i];
            }
            counter++;
        }
        return newArray;
    }

    public static void printArray(int[][] array) {
        for (int[] index : array) {
            System.out.println(Arrays.toString(index));
        }
    }
}


