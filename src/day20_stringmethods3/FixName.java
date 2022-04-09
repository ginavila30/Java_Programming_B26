package day20_stringmethods3;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName= scan.next().trim().toLowerCase();
        System.out.println("Enter last name:");
        String lastName= scan.next().trim().toLowerCase();

        String firstLetterName=firstName.substring(0,1).toUpperCase();
        String firstLetterLastName =lastName.substring(0,1).toUpperCase();
        String restOfName=firstName.substring(1);
        String restOfLastName=lastName.substring(1);

        String fixedName=firstLetterName+restOfName+" "+firstLetterLastName+restOfLastName;
        System.out.println(fixedName);




    }
}
