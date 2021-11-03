package ua.polikarpov.hw5.Task2;

public class CheckArray {
    public static boolean checkArray(int[] array) {
        for (int i = 2; i < array.length - 1; i++)
            if (array[i] <= array[i + 1]) {
                return false;
            }
        return true;
    }
}
