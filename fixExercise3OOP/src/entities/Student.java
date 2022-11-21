package entities;

public class Student {

    public String name;
    public double trimester1;
    public double trimester2;
    public double trimester3;

    public double finalGrade () {
        return trimester1 + trimester2 + trimester3;
    }

    public double missingPoints () {

        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        }
        else {
            return 0.0;
        }
    }
}
