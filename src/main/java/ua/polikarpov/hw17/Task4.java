package ua.polikarpov.hw17;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(81, 47, 85, 91, 74);

        Integer min = numbers.stream()
                .reduce(Integer.MAX_VALUE, (left, right) -> left < right ? left : right);

        System.out.println(min);
    }
}
