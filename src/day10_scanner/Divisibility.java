/*Ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values

    Ex:
    Enter a number
    65

    65 is divisible by 2: false
    65 is divisible by 3: false
    65 is divisible by 5: true*/

package day10_scanner;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num= input.nextInt();

        boolean divBy2=(num%2)==0;
        boolean divBy3=(num%3)==0;
        boolean divBy5=(num%5)==0;

        System.out.println("The number is: "+num+"\nIs the number divisible by 2: "+divBy2+"\nIs the number divisible by 3: "+divBy3+"\nIs the number divisible by 5: "+divBy5);
    }
}
