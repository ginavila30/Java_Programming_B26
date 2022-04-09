package day23_loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word= scan.nextLine();//madam
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){//

            reverse+=word.charAt(i);
        }

        if (word.equalsIgnoreCase(reverse)){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("It is not a palindrome");}
    }
}
