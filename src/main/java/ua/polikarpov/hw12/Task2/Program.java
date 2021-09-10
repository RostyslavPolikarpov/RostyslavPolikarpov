package ua.polikarpov.hw12.Task2;

public class Program {
    public static void main(String[] args) {
        try {
            System.out.println("Result 1: " + TwoMethods.g(4, 0));
        }
        catch (ArithmeticException arithmeticException) {
            System.out.println("Exception 1: " + arithmeticException);
            System.out.println("Exception caught!");
        }
        System.out.println();
        try {
            System.out.println("Result 2: " + TwoMethods.f(TwoMethods.g(2, 0)));
        }
        catch (ArithmeticException aE) {
            System.out.println("Exception 2: " + aE);
            System.out.println("Exception caught!");
        }
    }
}
