package day58_exceptions_recap.bank;

import day52_final_key_word.hiding.B;

public class UserAccounts {
    public static void main(String[] args) {
        Bank accountOne=new Bank();
        accountOne.balance=1000;
        accountOne.withdraw(500);
        System.out.println(accountOne.balance);
//        accountOne.withdraw(2000); // This throws an unchecked exception, if I want to handle it I should use try catch
//        System.out.println(accountOne.balance);

        //valid inputs
        try {
            accountOne.login("jamesbond","007");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }

        //invalid user
        try {
            accountOne.login("james","007");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }

        //invalid password
        try {
            accountOne.login("jamesbond","something");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}
