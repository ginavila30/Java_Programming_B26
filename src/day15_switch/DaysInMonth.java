/*Days In Month (slightly different version than before)

Write a program that will accept a month name and outputs how many days are in that month

data:

    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
*/
package day15_switch;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the month name:");
        String month= scan.next();
        int daysInMonth=0;
        boolean valid=true;

        switch(month){
            case"February":
                daysInMonth=28;break;
            case"April": case "June": case "September":case "November":
                daysInMonth=30; break;
            case "January":case "March":case "May":case "July":case "August":case "October":case "December":
                daysInMonth=31; break;
            default:
                System.out.println("Invalid Input");
                valid=false;
        }
       if(valid) System.out.println(month+" has "+daysInMonth+" days.");

    }
}
