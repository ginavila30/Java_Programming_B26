package day58_exceptions_recap.ink;
/*Create a class InvalidColorException
    inherit the Exception class to create a checked exception

    create a constructor that accepts a String parameter. Use the String argument to the call the super constructor
*/
public class InvalidColorException extends Exception{
    public InvalidColorException(String msg){
        super(msg);
    }
}
