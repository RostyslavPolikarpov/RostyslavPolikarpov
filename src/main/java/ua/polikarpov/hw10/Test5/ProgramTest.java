package ua.polikarpov.hw10.Test5;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

class ProgramTest {

    @Test
    void main() {
        int[] array = {7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array));
        System.out.println(testCheckArray(array));
        boolean expected = false; // true
        assert (expected);
    }

    @Test
    boolean testCheckArray(int[] array) {
        boolean check = false;
        for (int i = 2; i < array.length - 1; i++) {
            for (int element : array) {
                if (array[i] <= array[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}