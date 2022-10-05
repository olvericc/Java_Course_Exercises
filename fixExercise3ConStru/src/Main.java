import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int  number1, number2;

        number1 = sc.nextInt();
        number2 = sc.nextInt();

        // multiple numbers are those that result in zero
        if (number1 % number2 == 0 || number2 % number1 == 0) {
            System.out.println("Are multiples");
        } else {
            System.out.println("Not are multiples");
        }

        sc.close();

    }
}