package day16_Review;

import java.util.Scanner;

public class Retake {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What was the grade?");
        int grade= scan.nextInt();
        System.out.println("Which attempt number is it?");
        int attemptNum= scan.nextInt();
        boolean valid= attemptNum<=4&&attemptNum>=0; // instead of using only true or false value. We used a boolean condition to know if it's valid and then print on line 24.

     if (attemptNum==1){
        grade= grade-(int)(grade *0.1);
    }else if (attemptNum==2){
       grade -=grade*0.2;
    }else if (attemptNum==3){
        grade *=0.65;
    }else{
         System.out.println("Not valid attempt number");

     }
        if(valid)System.out.println((double) grade);

        // casting to double just to practice.
}  }
