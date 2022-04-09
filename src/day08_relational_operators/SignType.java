package day08_relational_operators;

public class SignType {
    public static void main(String[] args) {
        /*
         Task:
            Declare and assign a number

            I want to know the sign of the number
                if the number positive
                is the number negative
                is the number 0
     */

        int num=-52;
         boolean isPositive= num>0;
         boolean isNegative= num<0;
         boolean isZero= num==0;

        System.out.println("Positive number: "+isPositive);
        System.out.println("Negative number: "+isNegative);
        System.out.println("Zero: "+isZero);
    }
}
