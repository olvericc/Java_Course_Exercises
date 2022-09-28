import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        // piece 1 data
        int piece1Id, piece1Quantity;
        double piece1Value, piece1Calc;

        // piece 2 data
        int piece2Id, piece2Quantity;
        double piece2Value, piece2Calc;

        double total;

        // piece 1 input data
        piece1Id = sc.nextInt();
        piece1Quantity = sc.nextInt();
        piece1Value = sc.nextDouble();
        piece1Calc = piece1Quantity * piece1Value;

        // piece 2 input data
        piece2Id = sc.nextInt();
        piece2Quantity = sc.nextInt();
        piece2Value = sc.nextDouble();
        piece2Calc = piece2Quantity * piece2Value;

        // data processing of piece 1 and piece 2
        total = piece1Calc + piece2Calc;

        // data output
        System.out.printf("Amount to pay: U$ %.2f%n", total);

        sc.close();

    }
}