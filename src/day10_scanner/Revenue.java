package day10_scanner;
import  java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // This is the scanner object. We can think about it as Scanner variable.
        System.out.println("Enter the price:");
        double price=scan.nextDouble();
        System.out.println("Enter the quantity: ");
        int quantity= scan.nextInt();
        double revenue=price*quantity;

        System.out.println("The Revenue is $: "+revenue);

    }
}
