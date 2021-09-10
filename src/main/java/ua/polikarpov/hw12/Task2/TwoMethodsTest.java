package ua.polikarpov.hw12.Task2;

import static org.junit.jupiter.api.Assertions.*;

class TwoMethodsTest {


    @org.junit.jupiter.api.Test
    void f() throws Exception {
        TwoMethods method = new TwoMethods();
        int actual = method.f(TwoMethods.g(2, 1));
        int expected = 2;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void g() throws Exception {
        TwoMethods method = new TwoMethods();
        int actual = method.g(2, 1);
        int expected = 2;
        assertEquals(expected, actual);
    }
}