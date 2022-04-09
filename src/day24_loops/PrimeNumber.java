package day24_loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number= scan.nextInt();
        boolean prime=true; // we could do prime = number>=2 this will avoid any issues with negative numbers or numer 1



        for (int i = 2; i <number ; i++) {// I run from two and until before the number given, because, a prime number is evenly divisible by 1 and itself. So I just need to check if the number is divisible starting 2 and until 1 number before the number I am checking. Example: 11, will be checked divisibility from 2 to 10. If one time 11 is evenly divided by any number from 2 to 10 it will make it a not prime, but since it is not evenly divisible by any other numbers than 1 and itself, prime is true.

            if(number%i==0){
                prime=false;
                break; // we use break to end the loop as soon as the number is evenly divisible by any number starting 2 until one before the number itself.


            }

        }
        if(prime){//true
            System.out.println(""+number+" prime");
        } else{ System.out.println(""+number+" not prime");}//false
    }


}
