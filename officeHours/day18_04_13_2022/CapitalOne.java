package day18_04_13_2022;

public class CapitalOne {

    public static void main(String[] args) {
        BankAccount user1 = new BankAccount("Gina S.", 2398754);
        user1.withdraw(200);
        user1.checkBalance();
        user1.deposit(500);
        user1.checkBalance();
    }
}
