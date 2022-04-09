package day10_scanner;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year=input.nextInt();

        boolean leapYear=year%4==0;
        boolean leapYear2=year%100==0;
        boolean leapYear3=year%400 !=0;// not equal
        boolean conclusion=leapYear||(leapYear2&&leapYear3);
        System.out.println("Is it a leap year? "+conclusion);
    }
}
