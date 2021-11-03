package ua.polikarpov.hw10;

import org.junit.jupiter.api.Test;
import ua.polikarpov.hw5.Task2.CheckArray;

import static org.junit.jupiter.api.Assertions.*;

class Test_Hw5_Task2 {

    @Test
    void checkArray() {
        CheckArray check = new CheckArray();
        int[] array = {7,6,5,4,3,2,1};
        boolean actual = check.checkArray(array);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}