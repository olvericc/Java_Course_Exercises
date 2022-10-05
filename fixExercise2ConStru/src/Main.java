import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number, result;

        number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("Pair");
        }
        else if (number % 3 == 0){
            System.out.println("Odd");
        }

        sc.close();

    }
}