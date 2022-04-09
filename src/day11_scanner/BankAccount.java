package day11_scanner;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your balance?");
        double balance= scan.nextDouble();
        System.out.println("How much are you trying to withdraw?");
        double withdraw= scan.nextDouble();

        balance-=withdraw;

        System.out.println("Balance before fee:"+balance);

        if (balance<0){ balance-=100;
            System.out.println("Took out too much, 100 overdraft fee applies.");}
        System.out.println("Balance: $"+balance);


    }
}
