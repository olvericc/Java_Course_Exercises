import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // starting the object Scanner
        Scanner sc = new Scanner(System.in);

        // var declaration
        int value1, value2, sum;

        // data input
        value1 = sc.nextInt();
        value2 = sc.nextInt();

        // data processing
        sum = value1 + value2;

        // data output
        System.out.println("Sum: " + sum);

        // closing the Scanner
        sc.close();

    }
}