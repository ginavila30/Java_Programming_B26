package day33_methods;

import java.util.Scanner;

public class Age {
    public static void getAge(int birthYear) {
        int currentYear = 2022;
        int age = currentYear - birthYear;
        System.out.println("Your age is: " + age);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your birth year");
        getAge(scan.nextInt());
    }
}

