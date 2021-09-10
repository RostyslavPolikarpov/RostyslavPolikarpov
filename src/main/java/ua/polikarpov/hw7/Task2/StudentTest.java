package ua.polikarpov.hw7.Task2;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void getScholarship() {
        Student student = new Student("Rostyslav", "Polikarpov",
                "JAVA advanced 3", 5);
        int expected = 100;
        assertEquals(expected, student.getScholarship());
    }
}