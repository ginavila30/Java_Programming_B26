package day09_scanner;
import java.util.Scanner;// 1st step enter import
public class FirstScanner {
    public static void main(String[] args) { // then main method

        Scanner input= new Scanner(System.in); // Made an object.
        System.out.println("Please enter a number");
        int number = input.nextInt();
        System.out.println("This is your number"+number);
    }
}
