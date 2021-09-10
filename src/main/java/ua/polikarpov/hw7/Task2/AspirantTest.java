package ua.polikarpov.hw7.Task2;

import static org.junit.jupiter.api.Assertions.*;

class AspirantTest {

    @org.junit.jupiter.api.Test
    void getScholarship() {
        Aspirant aspirant = new Aspirant("JAVA in embeded system", "Rostyalav",
                "Polikarpov", "JAVA advanced 3", 5);
        int expected = 200;
        assertEquals(expected, aspirant.getScholarship());
    }
}