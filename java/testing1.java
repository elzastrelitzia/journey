import java.util.Scanner;

public class testing1 {
    public static void main(String[] args) {
        // beat my mess :D
        Scanner scanner = new Scanner(System.in);

        System.out.print("hello, what do you want to buy today?: ");
        String item = scanner.nextLine();

        System.out.print("how many would you like to buy?: ");
        int quantity = scanner.nextInt();

        System.out.print("what much the price for each?: ");
        double price = scanner.nextDouble();

        System.out.println("");
        System.out.println("you have bought: " + quantity + " " + item );

        double total = price * quantity;
        String currency = "Rp.";

        System.out.println("your total is: " + currency + total );

        System.out.println("good day!");

        scanner.close();
    }
}
