package ua.polikarpov.hw7.Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getScholarship() {
        Student student1 = new Student("", "", "", 5);
        Student student2 = new Student("", "", "", 3);
        assertEquals(100, student1.getScholarship());
        assertEquals(80, student2.getScholarship());
    }
}