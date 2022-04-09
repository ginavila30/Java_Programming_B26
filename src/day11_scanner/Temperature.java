package day11_scanner;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the temperature:");
        int temperature= scan.nextInt();
        boolean niceTemperature=temperature>=70;
        if (niceTemperature){
            System.out.println("Its a nice day. \nGo outside, but with your laptop to practice Java");}else{
            System.out.println("It's too cold.\nCode more Java");
        }

    }
}
