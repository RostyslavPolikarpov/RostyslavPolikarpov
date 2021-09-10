package ua.polikarpov.hw7.Task2;

public class Task2 {

    public static void main(String[] args) {
        Student[] student = new Student[4];
        student[0] = new Student("Rostyslav", "Polikarpov",
                "JAVA advanced 3", 5);
        student[1] = new Student("Rostyslav", "Polikarpov",
                "JAVA advanced 3", 5);
        student[2] = new Aspirant("JAVA in embeded system", "Rostyalav",
                "Polikarpov", "JAVA advanced 3", 5);
        student[3] = new Aspirant("JAVA in embeded system", "Rostyalav",
                "Polikarpov", "JAVA advanced 3", 5);
        for (Student students : student) {
            System.out.println(students);
            System.out.println("Scholarship: " + students.getScholarship());
        }
    }
}

