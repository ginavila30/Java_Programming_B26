package day58_exceptions_recap.ink;
/*Create a class OutOfInkException
    inherit the RuntimeException class to create an unchecked exception

    create a constructor that accepts a String parameter. Use the String argument to the call the super constructor*/
public class OutOfInkException extends RuntimeException {
    public OutOfInkException(String msg){
        super(msg);
    }
}
