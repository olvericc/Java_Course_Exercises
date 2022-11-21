package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println(employee);

        System.out.print("What percentage increase the salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalaryPercentage(percentage);

        System.out.println();
        System.out.println("Updated data: " + employee);

        sc.close();

    }

}