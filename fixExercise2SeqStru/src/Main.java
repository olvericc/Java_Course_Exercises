import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double circleRadius, circleArea;

        circleRadius = sc.nextDouble();

        circleArea = 3.14159 * Math.pow(circleRadius, 2);

        System.out.printf("Circle Area equals to: %.4f%n", circleArea);

        sc.close();

    }
}