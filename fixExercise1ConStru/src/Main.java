import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        number = sc.nextInt();

        if (number < 0 ){
            System.out.println("Negative");
        }
        else {
            System.out.println("Not negative");
        }

        sc.close();

    }
}