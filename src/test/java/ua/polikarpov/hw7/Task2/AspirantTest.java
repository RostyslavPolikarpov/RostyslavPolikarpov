package ua.polikarpov.hw7.Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AspirantTest {

    @Test
    void getScholarship() {
        Aspirant aspirant1 = new Aspirant("", "", "", "", 5);
        Aspirant aspirant2 = new Aspirant("", "", "", "", 3);
        assertEquals(200, aspirant1.getScholarship());
        assertEquals(100, aspirant2.getScholarship());
    }
}