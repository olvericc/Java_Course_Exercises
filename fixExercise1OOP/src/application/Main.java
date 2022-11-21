package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");

        Product product = new Product();

        product.width = sc.nextDouble();
        product.height = sc.nextDouble();

        System.out.println(product);

        sc.close();

    }

}