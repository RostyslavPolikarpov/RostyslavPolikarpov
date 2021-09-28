package ua.polikarpov.hw17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Бразилия", "Аргентина", "Чили", "Ангола",
                "Эфиопия", "Монголия", "Намибия", "Судан"));

        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
