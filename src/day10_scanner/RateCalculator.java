
/*write a program for a rate calculator: RateCalculator
        1. asks the user to enter a salary (double)
        2. asks the user how many hours he/she works in a week (as int)
        3. print the hourly rate (double) of the employee
        assume that one year has 52 weeks
        hourly rate = salary / (hours weekly * 52)*/
package day10_scanner;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your salary: ");
        Double salary= input.nextDouble();
        System.out.println("Howe many hours do you work a week? ");
        int hoursAWeek=input.nextInt();

        System.out.println("The person hourly rate is: "+salary/(hoursAWeek*52));



    }
}
