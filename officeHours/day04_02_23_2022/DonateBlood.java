package day04_02_23_2022;

import java.util.Scanner;

public class DonateBlood {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("What is your age?");
        int age= scan.nextInt();
        System.out.println("What is your weight");
        int weight= scan.nextInt();
        String message="";
        String result;

        if(age>18){
            if(weight>50){
                message="Yo are eligible to donate blood";
            }else{message="You are not eligible to donate blood";}



        }else{message="Age must be greater than 18";}

        System.out.println(message);

// Ternary  example of a nested
      result=age>18?weight>50?"Yo are eligible to donate blood":"You are not eligible to donate blood":"Age must be greater than 18";
        System.out.println(result);

    }
}
