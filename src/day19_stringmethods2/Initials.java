package day19_stringmethods2;

import java.util.Locale;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName= scan.nextLine().toUpperCase();
        System.out.println("Enter your last name:");
        String lastName= scan.nextLine().toUpperCase();

        System.out.println(""+firstName.charAt(0)+"."+lastName.charAt(0));

    }
}
