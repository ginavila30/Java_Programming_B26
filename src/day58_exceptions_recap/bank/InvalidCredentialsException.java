package day58_exceptions_recap.bank;

public class InvalidCredentialsException extends Exception{// the parent is exception class, so it is a checked exception
    public InvalidCredentialsException(String msg){
        super(msg);
    }
}
