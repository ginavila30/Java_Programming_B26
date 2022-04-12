package day17_04_11_2022;

public class UsingBankAccount {

    public static void main(String[] args) {
        BankAccount user1=new BankAccount("Gina S.",2398754,12000);
        System.out.println(user1.withdraw(0));
        System.out.println(user1.checkBalance());
        System.out.println(user1.deposit(0));
        System.out.println(user1.checkBalance());
    }
}
