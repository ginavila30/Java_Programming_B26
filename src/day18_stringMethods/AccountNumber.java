package day18_stringMethods;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the account number");
        String accountNumber=scan.nextLine();
        boolean startWith2=accountNumber.startsWith("2");
        boolean startWith5=accountNumber.startsWith("5");
        boolean length7=accountNumber.length()==7;
        boolean length10=accountNumber.length()==10;

        if (accountNumber.isEmpty()){
            System.out.println("Empty input given.");
        }else{
            if((startWith2||startWith5)&&(length7||length10)){
                if(startWith2&&length7){
                    System.out.println("Valid 7-digit account number");
                }

                if (startWith5&&length10){
                    System.out.println("Valid 5-digit account number" );
                }


            }else {
                System.out.println("Invalid account number");
                if (startWith2 && !length7) {
                    System.out.println("Invalid 7-digit account number");
                }
                if (startWith5 && !length10) {
                    System.out.println("Invalid 5-digit account number");
                }
            }}}}
