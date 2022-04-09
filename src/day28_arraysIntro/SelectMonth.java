package day28_arraysIntro;

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number of the month");
        int monthNum=scan.nextInt();

        String[]monthName={"January","February","March","April","May","June","July","Agust","September","October","November","December"};


           if(monthNum>=1&&monthNum<=12) {System.out.println(monthName[monthNum-1]);}else {
               System.out.println("Invalid Input");
           }

    }
}
