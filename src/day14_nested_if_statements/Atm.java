package day14_nested_if_statements;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("***Welcome to ATM***\nPlease enter your card and then type your Pin Code:");
        int pincode= scan.nextInt();
        int expectedPincode=2564;
        boolean validPin=pincode==expectedPincode;

        if (validPin){
            System.out.println("log in");
            System.out.println("Select an option:");
            System.out.println("\t1) Check Balance");
            System.out.println("\t2) Withdraw");
            System.out.println("\t3) Deposit");
            int userOption= scan.nextInt();
            if (userOption==1){
                System.out.println("your balance is: $"+10_000_000);
            }else if(userOption==2){
                System.out.println("How much do you want to withdraw?");
                double withdrawAmount=scan.nextDouble();
                System.out.println("Withdrawing: $"+withdrawAmount);
            }else if (userOption==3){
                System.out.println("Please deposit the money.");
            }else {
                System.out.println("Invalid selection.");
            }
        }else{
            System.out.println("Invalid pin, please try again");}
    }
}
