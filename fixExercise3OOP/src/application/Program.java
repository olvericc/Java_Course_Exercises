package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Student Name: ");
        student.name = sc.nextLine();
        System.out.print("Trimester 1: ");
        student.trimester1 = sc.nextDouble();
        System.out.print("Trimester 2: ");
        student.trimester2 = sc.nextDouble();
        System.out.print("Trimester 3: ");
        student.trimester3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + student.finalGrade());

        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS %n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

        sc.close();

    }

}