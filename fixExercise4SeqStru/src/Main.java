import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int employeeId, workedHours;
        double valueOfWorkedHours, salary;

        employeeId = sc.nextInt();
        workedHours = sc.nextInt();
        valueOfWorkedHours = sc.nextDouble();

        salary = workedHours * valueOfWorkedHours;

        System.out.println("Employee ID: " + employeeId);
        System.out.printf("Salary: U$ %.2f%n", salary);

        sc.close();

    }
}