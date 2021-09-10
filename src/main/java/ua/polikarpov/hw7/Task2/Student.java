package ua.polikarpov.hw7.Task2;

public class Student {

    String firstName;
    String lastName;
    String group;
    double overageMark;

    public Student(String firstName, String lastName, String group, double overageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.overageMark = overageMark;
    }

    public int getScholarship() {
        return overageMark == 5 ? 100 : 80;
    }

    @Override
    public String toString() {
        return "Student{ First name: " + firstName + "; "
                + "last name: " + lastName + "; "
                + "group: " + group + "; "
                + "overage mark: " + overageMark + "}";
    }

}
