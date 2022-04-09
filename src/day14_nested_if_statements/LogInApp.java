package day14_nested_if_statements;
/*Task:  inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
    example expected:
        pin: 1552
        ssn: 1234

outputs:

    when the pincode and ssn match the expected print:
        Authentication successful

    when the pincode or ssn are not correct print:
        Authentication failed

    when the pincode was not correct print:
        incorrect pin code

    when the ssn is not correct print:
        invalid ssn
First Approach
Scanner input = new Scanner(System.in);
        System.out.println("Please enter your pincode: ");
        int actualPin = input.nextInt();
        System.out.println("Please enter the last 4 digits of your ssn");
        int actualSSN = input.nextInt();

        int expectedPin = 1552;
        int expectedSSN = 1234;

        if(actualPin == expectedPin && actualSSN == expectedSSN){
            System.out.println("Authentication successful");
        } else {

            System.out.println("Authentication failed");

            if(actualPin != expectedPin){
                System.out.println("incorrect pin code");
            }

            if(actualSSN != expectedSSN){
                System.out.println("incorrect ssn");
            }

        }
*/

//Second approach with boolean
import java.util.Scanner;

public class LogInApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the four digit pin code");
        int actualDigitPin = scan.nextInt();
        System.out.println("Enter SSN last four digits");
        int actualSsn = scan.nextInt();
        int expectedDigitPin = 1552;
        int expectedSsnDigit = 1234;
        boolean correctPin=actualDigitPin == expectedDigitPin;
        boolean correctSsn=actualSsn == expectedSsnDigit;

        if (correctPin && correctSsn) {
            System.out.println("Authentication successful");
        } else {
            System.out.println( "Authentication failed");
            if (!correctSsn) {
                System.out.println("incorrect ssn");}
            if (!correctPin) {
                System.out.println("incorrect pin code");
            }
        }

    }}
