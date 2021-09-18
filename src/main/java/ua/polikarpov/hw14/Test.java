package ua.polikarpov.hw14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Util<T, S> implements Multiplier {
    S value;

    public void printHashCode(S e) {
        System.out.println("HashCode: " + e.hashCode());
    }

    public void save(S value) {
        this.value = value;
    }

    public S get() {
        return value;
    }

    public void sum(Integer one, Integer two) { // should work only with numbers
        System.out.println(one + two);
    }

    @Override
    public Number[] doubleValueIn(Number[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
        }
        return array;
    }

    public double sumOfArray(List<? extends T> list) {
        double s = 0.0;
        for (T n : list) {
            s += n.hashCode();
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
        Util<Number, String> util = new Util<>();
        util.printHashCode("Test");
        util.save("Value");
        System.out.println(util.get());
        Number[] arr = {1, 2, 3, 4, 0, 5, 6, 7};
        System.out.println(Arrays.toString(util.doubleValueIn(arr)));
        System.out.println("Sum of array: " + util.sumOfArray(Arrays.asList(arr)));
        List<Number> list = new ArrayList<>();
        util.addNumbers(list);
        System.out.println(Arrays.toString(list.toArray()));
    }
}
