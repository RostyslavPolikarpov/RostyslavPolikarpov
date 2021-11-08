package ua.polikarpov.hw12.Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoMethodsTest {

    @Test
    void f() {
        TwoMethods methodF1 = new TwoMethods();
        TwoMethods methodF2 = new TwoMethods();
        assertEquals(0, methodF1.f(0));
        assertEquals(2, methodF2.f(2));

    }

    @Test
    void g() {
        TwoMethods methodG1 = new TwoMethods();
        TwoMethods methodG2 = new TwoMethods();
        assertEquals(0, methodG1.g(0, 1));
        assertEquals(2, methodG2.g(2, 1));
    }
}