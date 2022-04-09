package day21_loops;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String str= scan.nextLine();

        // With chartAt
        int middle=str.length()/2;

        if (str.length()%2==0){
            System.out.println(""+(str.charAt(middle-1))+(str.charAt(middle)));
        }else{
            System.out.println(""+str.charAt(middle));
        }

        // With Substring
        System.out.println(str.substring(str.length()/2, str.length()/2+1));//odd length
        System.out.println(str.substring(str.length()/2-1, str.length()/2+1));//even length
}}


