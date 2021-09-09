package ua.polikarpov.hw2;

public class Task4 {

    public static void main(String[] args) {
        // вызов метода и передача чисел в метод в качестве параметров
        showMinNumber(-5, 8, 4);
    }

    public static float showMinNumber(int a, int b, int c) {
        int min = Math.abs(a < b ? a : b); // нахождение числа по модулю
        min = Math.abs(c < min ? c : min); // нахождение числа по модулю
        System.out.println("Smallest is: " + min);
        return min;
    }
}
