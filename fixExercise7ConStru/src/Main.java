import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double value1 = sc.nextDouble();
        double value2 = sc.nextDouble();

        if (value1 == 0 && value2 == 0){
            System.out.println("Origin");
        } else if (value1 >  0 && value2 > 0) {
            System.out.println("First quadrant");
        } else if (value1 < 0 && value2 > 0) {
            System.out.println("Second quadrant");
        } else if (value1 < 0 && value2 < 0) {
            System.out.println("Third quadrant");
        } else if (value1 > 0 && value2 < 0) {
            System.out.println("Fourth quadrant");
        }

        sc.close();

    }
}