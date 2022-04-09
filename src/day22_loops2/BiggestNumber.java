package day22_loops2;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        //write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
        Scanner scan=new Scanner(System.in);
        int biggerNum=0;
        int smallestNum=0;
        int repetitions=0;

        while(repetitions<5){
            System.out.println("Enter a number:");
            int num= scan.nextInt();
            if (num>=biggerNum){biggerNum=num;}
            if (num<=smallestNum){smallestNum=num;}
            repetitions++;

        }

        System.out.println(biggerNum+"\n"+smallestNum);
    }
}
