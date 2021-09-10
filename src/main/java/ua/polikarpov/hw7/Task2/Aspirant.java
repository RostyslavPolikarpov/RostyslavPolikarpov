package ua.polikarpov.hw7.Task2;

public class Aspirant extends Student {

    String researchWork;

    public Aspirant(String researchWork, String firstName, String secondName, String group, double overMark) {
        super(firstName, secondName, group, overMark);
        this.researchWork = researchWork;
    }

    public int getScholarship() {
        return overageMark == 5 ? 200 : 100;
    }

    @Override
    public String toString() {
        return "Aspirant{ Research work: " + researchWork + "; "
                + "first name: " + firstName + "; "
                + "last name: " + lastName + "; "
                + "group: " + group + "; "
                + "overage mark: " + overageMark + "}";
    }
}
