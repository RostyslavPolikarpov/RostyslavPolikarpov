package ua.polikarpov.hw12.Task3;

public class ThreeException {

    public void negativeSize(int x) {
        int[] array = new int[-x];
        for (int element : array) {
            System.out.println(array[element]);
        }
    }

    public void byZero(int array[]) {
        for (int elements : array) {
            elements /= 0;
            System.out.println(elements);
        }
    }

    public void outOfBounds(int[] array, int i) {
        System.out.println(array[i]);
    }

    public static void main(String[] args) {
        ThreeException variable = new ThreeException();
        int[] array = {1, 2, 3, 4, 5};
        try {
            variable.negativeSize(10); // отрицательный размер массива
            variable.byZero(array); // деление на ноль
            variable.outOfBounds(array, 10); // выход за пределы массива
        } catch (NegativeArraySizeException | ArithmeticException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception: " + ex);
        }
    }
}
