package day11_scanner;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you hungry?");
       boolean isHungry= scan.nextBoolean();

        if (isHungry){
            System.out.println("You are hungry son I will get some food");}else {
            System.out.println("great, then practice Java");
        }
    }
}
