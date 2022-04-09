package day18_stringMethods;

import java.util.Scanner;

public class UserAndPassword {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Username");
        String username= scan.nextLine();
        System.out.println("Enter Password");
        String password= scan.nextLine();
        int passwordNum= password.length();

        if(passwordNum>=5){

            if (password.contains(username)){
                System.out.println("Invalid password, username should not be in it");
                password="password";
            }else{
                System.out.println("Valid Password");
            }

        }else{
            System.out.println("Password cannot be less than 5 characters");
        }

    }
}
