import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number1, number2, number3, number4, difference;

        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();
        number4 = sc.nextInt();

        difference = (number1 * number2 - number3 * number4);

        System.out.println("Difference equals to: " + difference);

        sc.close();

    }
}