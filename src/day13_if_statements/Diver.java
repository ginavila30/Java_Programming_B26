package day13_if_statements;

import java.util.Scanner;
/*create a class Diver

You are diving in the ocean. Your oxygen tank has a certain level (number)

declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

    Above 90 - Your tank is full
    Above 80 - Still okay
   	Above 70 - Don't go too far
   	Above 60 - Start to head back
    Above 50 - Be careful now you at at 50%*/

public class Diver {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("what is your oxygen level");
        int oxygenLevel= scan.nextInt();
        String message;
        if (oxygenLevel>=90){
            message="Your tank is full";
        }else if (oxygenLevel>=80){
            message="Still OK";
        }else if (oxygenLevel>=70){
            message="Start to head back";
        }else if (oxygenLevel>=60){
            message="Start to head back.";
        }else if (oxygenLevel>=50){
            message="Be careful, now you are at 50%";
        }else{
            message="low";
        }
        System.out.println(message);
    }
}
