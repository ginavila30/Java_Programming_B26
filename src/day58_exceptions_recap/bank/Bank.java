package day58_exceptions_recap.bank;

public class Bank {
    double balance;

    public void withdraw(double amountToTakeOut){
        if(amountToTakeOut>balance){
            throw new NotEnoughMoneyException("The balance only has "+balance);
        }
        balance-=amountToTakeOut;
    }
    public void login(String userName, String password) throws InvalidCredentialsException{
        if(!userName.equals("jamesbond")){
            throw new InvalidCredentialsException("Invalid username");
        }
        if(!password.equals("007")){
            throw new InvalidCredentialsException("Invalid password");
        }

        System.out.println("Logged in ");

    }
}
