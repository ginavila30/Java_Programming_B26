package day33_methods;

import java.util.Scanner;

public class CountNumbers {
    public static  void countNumbers(int numUpto){
        for (int i = 0; i <=numUpto ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();// this is an extra space not to interfere with future code when this method is called.

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number you want to go up to");
        countNumbers(scan.nextInt());
    }
}
