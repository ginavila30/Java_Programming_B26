package day09_scanner;
import java.util.Scanner;
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);


        System.out.println("Enter a number:");
       int number1= input.nextInt();
        System.out.println("Enter a second number:");
        int number2 =input.nextInt();

        boolean comparing=number1==number2;
        System.out.println("Are the numbers equal?" +comparing);


    }
}
