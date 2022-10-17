import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcohol = 0;
        int gas = 0;
        int diesel = 0;

        int chosenFuel = sc.nextInt();

        while (chosenFuel != 4) {

            if (chosenFuel == 1) {
                alcohol += 1;
            } else if (chosenFuel == 2) {
                gas += 1;
            } else if (chosenFuel == 3) {
                diesel += 1;
            }

            chosenFuel = sc.nextInt();
        }

        System.out.println("Thank you so much!");
        System.out.println("Alcohol: " + alcohol);
        System.out.println("Gas: " + gas);
        System.out.println("Diesel: " + diesel);

        sc.close();

    }
}