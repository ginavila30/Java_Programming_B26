package day21_loops;

import java.util.Scanner;

public class NumberTo500 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        while(num>0&&num<=500){
            System.out.print(num++);
        }
    }
}
