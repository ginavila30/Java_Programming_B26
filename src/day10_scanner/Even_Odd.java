/*Ask the user to enter an int number. Determine if the number is even or odd
Print a boolean for both even and odd
*/
package day10_scanner;
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();

        boolean isEven=num%2==0;
        boolean isOdd=(num%2)!=0;
        //      isOdd=!isEven; This is also an option to do this.

        System.out.println("The number is even: "+isEven);
        System.out.println("The number is odd: "+isOdd);
    }
}
