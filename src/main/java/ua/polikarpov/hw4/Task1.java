package ua.polikarpov.hw4;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] array = new int[400];

        for (int i = 0; i < 400; i++) {
            array[i] = (int) (Math.random() * (10 + 1));
        }
        System.out.println("Arrays: " + Arrays.toString(array));
        arithmeticAverageArray(array);
        geometricMeanArray(array);
    }

    public static double arithmeticAverageArray(int array[]) {

        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += array[i];
        }

        double overage = sum / 10.0;
        System.out.println("Arithmetic overage is: " + overage);

        return overage;
    }

    public static double geometricMeanArray(int array[]) {

        double productOfNumbers = 1;
        for (int i = 1; i <= 10; i++) {
            productOfNumbers *= array[i];
        }

        double geometricMean = Math.pow(productOfNumbers, 1.0 / 10.0);
        System.out.println("Geometric mean is: " + geometricMean);

        return geometricMean;
    }
}



