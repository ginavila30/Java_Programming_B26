package day10_scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("What is today? ");
        String day= input.nextLine();

        System.out.println("Enter your first name: ");
        String name=input.next();

        System.out.println("Enter your last name: ");
        String lastName=input.next();



        System.out.println("What is your address? ");
        input.nextLine(); // The enter input from the line above is being absorbed by this line.
        String address= input.nextLine();

        System.out.println("Today is: "+day);
        System.out.println("First name: "+name);
        System.out.println("Last name: "+lastName);
        System.out.println("Address: "+address);


    }
}
