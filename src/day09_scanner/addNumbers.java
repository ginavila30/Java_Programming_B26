package day09_scanner;
import java.util.Scanner;
public class addNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a decimal number:");
        double num1=input.nextDouble();
        System.out.println("Enter a 2nd number:");
        int num2=input.nextInt();
        System.out.println("Enter a 2nd number:");
        int num3=input.nextInt();

        int sum=(int)num1+num2+num3;

        System.out.println("The sum of the numbers given is: "+sum);
    }
}
