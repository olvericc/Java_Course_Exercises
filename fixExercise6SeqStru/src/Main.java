import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double triangleArea, circleArea, trapezeArea, squareArea, rectangleArea;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        // triangle area
        triangleArea = a * c / 2f;

        // circle area
        circleArea = 3.14159 * Math.pow(c, 2);

        // trapeze area
        trapezeArea = (a + b) * c / 2f;

        // square area
        squareArea = Math.pow(b, 2);

        // rectangle area
        rectangleArea = a * b;

        System.out.printf("Triangle: %.3f%n", triangleArea);
        System.out.printf("Circle: %.3f%n", circleArea);
        System.out.printf("Trapeze: %.3f%n", trapezeArea);
        System.out.printf("Square: %.3f%n", squareArea);
        System.out.printf("Rectangle: %.3f%n", rectangleArea);

        sc.close();

    }
}