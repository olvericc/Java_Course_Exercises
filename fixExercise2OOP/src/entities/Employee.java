package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary () {
        return grossSalary - tax;
    }

    public void increaseSalaryPercentage (double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }

    @Override
    public String toString () {
        return "Employee: " + name + ", U$ " + String.format("%.2f%n", netSalary());
    }

}
