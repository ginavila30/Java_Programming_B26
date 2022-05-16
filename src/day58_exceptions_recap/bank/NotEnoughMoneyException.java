package day58_exceptions_recap.bank;

public class NotEnoughMoneyException extends RuntimeException { // unchecked exception because it is child of Runtime Exception
    public NotEnoughMoneyException(){
        super("Not enough Money in the account");
    }
    public NotEnoughMoneyException(String msg){
        super(msg);
    }
}
