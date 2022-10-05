import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int initialHour, finalHour, duration;

        initialHour = sc.nextInt();
        finalHour = sc.nextInt();

        // when the initial hour is smaller than the final hour
        if (initialHour < finalHour) {
            duration = finalHour - initialHour;
        } else {
            duration = (24 - initialHour) + finalHour;
        }

        System.out.println("The game lasted " + duration + " hour(s)!");

        sc.close();

    }
}