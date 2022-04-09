package day15_switch;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int day=scan.nextInt();
        String dayInWords="";// assigning default values to avoid issues with the variable having the possibility to have empty value.

        switch(day){
            case 1:
                dayInWords="Monday";break;
            case 2:
                dayInWords="Tuesday";break;
            case 3:
                dayInWords="Wednesday";break;
            case 4:
                dayInWords="Thursday";break;
            case 5:
                dayInWords="Friday";break;
            case 6:
                dayInWords="Saturday";break;
            case 7:
                dayInWords="Sunday";break;
            default:
                System.out.println("Not a day"); // here I could have assigned the "message value" to the dayInWords variable and I did not need to assign a default value at the top of my code.


        }
        System.out.println(day+"-->"+dayInWords);
    }
    }

