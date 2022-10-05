import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int productId, quantity;
        double total;

        System.out.println("ID-------------------DESCRIPTION-------------------PRICE");
        System.out.println("1----------------------HOTDOG--------------------U$ 4.00");
        System.out.println("2----------------------XSALAD--------------------U$ 4.50");
        System.out.println("3----------------------XBACON--------------------U$ 5.00");
        System.out.println("4--------------------SIMPLETOAST-----------------U$ 2.00");
        System.out.println("5-----------------------COKE---------------------U$ 1.50");
        System.out.println();
        System.out.println("Please, choose a ID and quantity for your order!");

        productId = sc.nextInt();
        quantity = sc.nextInt();

        if (productId == 1) {
            total = quantity * 4f;
            System.out.printf("Total of your order: U$ %.2f%n", total);
        } else if (productId == 2) {
            total = quantity * 4.5f;
            System.out.printf("Total of your order: U$ %.2f%n", total);
        } else if (productId == 3) {
            total = quantity * 5f;
            System.out.printf("Total of your order: U$ %.2f%n", total);
        } else if (productId == 4) {
            total = quantity * 2f;
            System.out.printf("Total of your order: U$ %.2f%n", total);
        } else if (productId == 5){
            total = quantity * 1.5f;
            System.out.printf("Total of your order: U$ %.2f%n", total);
        } else {
            System.out.println("Error, incorrect input value!");
        }

        sc.close();

    }
}