import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstPosition, secondPosition;

        firstPosition = sc.nextInt();
        secondPosition = sc.nextInt();

        while (firstPosition != 0 || secondPosition != 0) {
            if (firstPosition > 0 && secondPosition > 0) {
                System.out.println("first quadrant");
            } else if (firstPosition < 0 && secondPosition > 0) {
                System.out.println("second quadrant");
            } else if (firstPosition < 0 && secondPosition < 0 ) {
                System.out.println("third quadrant");
            } else if (firstPosition > 0 && secondPosition < 0) {
                System.out.println("fourth quadrant");
            }
            firstPosition = sc.nextInt();
            secondPosition = sc.nextInt();
        }

        System.out.println(" - ");

        sc.close();

    }
}