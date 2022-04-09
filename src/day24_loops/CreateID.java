package day24_loops;

import java.util.Scanner;

public class CreateID {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName= scan.next().trim();//john
        System.out.println("Enter your last name:");
        String lastName=scan.next().trim();//smith
        String id="";

        String nameInitial=""+firstName.charAt(0);
        nameInitial=nameInitial.toLowerCase();
        String lastInitial=""+lastName.charAt(0);
        lastInitial=lastInitial.toUpperCase();
        String lastRest=lastName.substring(1,3).toLowerCase();
        id+=nameInitial+lastInitial+lastRest+(firstName.length()*2);
        System.out.println("The ID is: "+ id);



    }
}
