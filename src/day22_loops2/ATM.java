package day22_loops2;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Welcome to ATM");
        int validPin=1234;
        int userPinInput;
        int attempts=0;

        do{
            System.out.println("Enter Pin:");
            userPinInput= scan.nextInt();
            attempts++;

        }while(validPin!=userPinInput&&attempts<3);

        if(validPin==userPinInput){
            System.out.println("Logged in");
        }else{
            System.out.println("Locked out");
        }
    }
}
