package day17_04_11_2022;

import day18_stringMethods.AccountNumber;

public class BankAccount {
    /*======= Task 2 =======
      	className --- > BankAccount   (instance vs Local  Var | instance Methods | Constr)

              fields / attributes / data that can have are:
                      1. AccountHolder, 2. AccountNumber, 3. Balance

              Methods (Actions)
                  1. CheckBalance,   2. deposit,  3. withdraw

              requirements:
                  1. user should be able to deposit money into their account --> deposit(double amount);
                      1.1 if the amount is less than or equal to 0
                               "Depositing amount can not be zero or negative"
                  2. user should be able to withdraw money from their account --> withdraw(double amount);
                      2.1 if the withdrawing account is greater than available balance
                                "Insufficient balance "
                      2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
                                "Withdrawing amount can not be negative or zero"
                  3. user should be able to see their balance --> checkBalance();
                      Example Output :
                          */
    String accountHolder;
    int accountNumber;
    double balance;

    public BankAccount (String accountHolder,int accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public String checkBalance(){
        return "Current balance is "+balance;
    }
    public String deposit(double amount){
        if(amount>0){balance+=amount;}
        return amount>0?"Deposit succesfully completed": "Depositing amount can not be zero or negative";
    }
    public String withdraw(double amount){
        if(amount>balance){return "Insuficient balance ";}
        else if(amount<=0){
            return "Withdrawing amount can not be negative or zero";}else{  balance-=amount;return "Processing " +
                "withdrawal";}
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
