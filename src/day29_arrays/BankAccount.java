package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Hardcoded & I know the values from beginning

        String [] bankAccount1={"Brad Smith","Checking","10021489","100,000,000"};
        System.out.println(bankAccount1.length);
        System.out.println(Arrays.toString(bankAccount1));
        System.out.println("Name "+bankAccount1[0]);
        System.out.println("Account type "+bankAccount1[1]);
        System.out.println("Account Num "+bankAccount1[2]);
        System.out.println("Balance "+bankAccount1[3]);

        //Hardcoded & I will assign values after initializing the array.

        String [] bankAccount2=new String[4];
        System.out.println(Arrays.toString(bankAccount2)); // This prints the default values of array for string (null) because I have not assign value to the elements.
        bankAccount2[0]= "Jamie Fox";
        bankAccount2[1]= "Savings";
        bankAccount2[2]= "1304587";
        bankAccount2[3]= "120000";
        System.out.println(Arrays.toString(bankAccount2));
        //bankAccount2[20]=""; Thi is out of bounds error because the array only have 4 elements.

        // Dynamic Scanner version

        String[]bankAccount3= new String[4];
        System.out.println("Enter your Full name");
        bankAccount3[0] = scan.nextLine();
        System.out.println("Enter your account type ");
        bankAccount3[1]=scan.nextLine();
        System.out.println("Enter the account number");
        bankAccount3[2]= scan.nextLine();
        System.out.println("Enter your balance");
        bankAccount3[3]= scan.nextLine();
        System.out.println(Arrays.toString(bankAccount3));

        // Loop Approach

        String[] bankAccount4=new String[4];
        String[]questions= {"Full name"+"Account Type"+"Account Number"+"Balance"};
        for (int i = 0; i <bankAccount4.length ; i++) {
            System.out.println("Enter your "+ questions[i]);
            bankAccount4[i]= scan.nextLine();
        }
        System.out.println(Arrays.toString(bankAccount4));


    }
}
