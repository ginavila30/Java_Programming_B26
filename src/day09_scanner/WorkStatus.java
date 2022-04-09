package day09_scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName=input.next();
        System.out.println("Enter your last name: ");
        String lastName=input.next();
        System.out.println("Are you an employee? Type true if Yes or false if NO");
        Boolean areYouEmployee=input.nextBoolean();
        System.out.println("Are you a student? Type true if Yes or false if NO");
        Boolean areYouStudent=input.nextBoolean();

        System.out.println(""+firstName+" "+ lastName+ "\nAre You an Employee? "+areYouEmployee+ "\nAre You a student? "+areYouStudent);

    }
}
