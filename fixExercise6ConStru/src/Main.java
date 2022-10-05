import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double value = sc.nextDouble();

        if (0 <= value && value <= 25) {
            System.out.println("interval [0, 25]");
        } else if (25 < value && value <= 50) {
            System.out.println("interval [25, 50]");
        } else if (50 < value && value <= 75) {
            System.out.println("interval [50, 75]");
        } else if (75 < value && value <= 100) {
            System.out.println("interval [75, 100]");
        } else {
            System.out.println("Out of interval");
        }

        sc.close();

    }
}