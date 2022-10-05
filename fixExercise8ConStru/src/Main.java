import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double income = sc.nextDouble();
        double incomeTax;

        if (0 < income && income <= 2000){
            System.out.println("free");
        }
        else if (income <= 3000) {
            incomeTax = (income - 2000.0) * 0.08;
            System.out.printf("Tax: U$ %.2f%n", incomeTax);
        }
        else if (income <= 4500) {
            incomeTax = (income - 3000) * 0.18 + 80;
            System.out.printf("Tax: U$ %.2f%n", incomeTax);
        }
        else if (income > 4500) {
            incomeTax = (income - 4500) * 0.28 + 350;
            System.out.printf("Tax: U$ %.2f%n", incomeTax);
        }
        else {
            System.out.println("Error: Out of interval");
        }

        sc.close();

    }
}