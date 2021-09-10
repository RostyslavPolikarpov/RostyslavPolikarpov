package ua.polikarpov.hw9.Pow;

import java.util.stream.IntStream;

interface Pow<T> {
    T pow(int number, int pow);
}

public class NumberPower {

    public static void main(String[] args) {
        Pow<Integer> pow = (final int x, int y) -> IntStream.range(0, y).map(value -> x).reduce(1, (a, b) -> a * b);
        System.out.println(pow.pow(2, 3));
    }
}
