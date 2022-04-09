package day06_Arithmetic_Operators;

public class DifferentTypes {
    public static void main(String[] args) {
        // both are int data type 5 and 10.
        System.out.println(10-5);
        System.out.println(10*5);
        System.out.println((double) 10/5);// 10 was cast to double.
        // double / int
        System.out.println(10.0/5);
        System.out.println((int)10d/5);
        System.out.println(10d+5);

        // double / double
        System.out.println(10.5/5.3);
        System.out.println((int)10.5/(int)5.3); // I casted the double arithmetical operation double int to an int.
        System.out.println((int)10.5/5);

        // Operators Rule for Byte and short.

        byte b1= 10;
        byte b2=20;

       // byte sum = b1+b2; This doesn't work because the values get changed to int during the calculation. How to solve it below:
        int sum = b1+b2; // I can do it as an int variable and since int is the default number it will be ok.
        byte sumByte = (byte)(b1+b2); // In te case I need byt data type I can cast the entire operation by putting it in parentheses.







    }
}
