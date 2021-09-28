package ua.polikarpov.hw14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Util<T> implements Multiplier<Number> {
    private T value;

    public void printHashCode(T e) {
        System.out.println("HashCode: " + e.hashCode());
    }

    public void save(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    @Override
    public Number[] doubleValueIn(Number[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].doubleValue() * array[i].doubleValue();
        }
        return array;
    }

    public <T extends Number> void sum(T one, T two) {
        System.out.println(one.doubleValue() + two.doubleValue());
    }

    public double sumOfArray(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list) {
            s += n.doubleValue();
        }
        return s;
    }

    public void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}

interface Multiplier<T extends Number> {
    T[] doubleValueIn(T[] array);
}

public class Test {
    public static void main(String[] args) {
        Util<String> util = new Util<>();
        util.printHashCode("Test");
        util.save("Value");
        System.out.println(util.get());
        Number[] arr = {1, 2, 3, 4, 0, 5, 6, 7};
        System.out.println(Arrays.toString(util.doubleValueIn(arr)));
        System.out.println(util.sumOfArray(Arrays.asList(arr)));
        List<Integer> list = new ArrayList<>();
        util.addNumbers(list);
        System.out.println(Arrays.toString(list.toArray()));
        util.sum(5, 5);
    }
}
