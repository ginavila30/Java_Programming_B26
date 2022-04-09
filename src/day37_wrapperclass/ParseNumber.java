package day37_wrapperclass;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {
        String year="2022";
        System.out.println("Next year will be "+(year+1));// This is concatenation
        int numYear=Integer.parseInt(year);
        System.out.println("Next year will be "+(numYear+1));// Here parse method converted String to int now I have an int value.

       // Task find  the age in 5 years approach 1
        Scanner scan= new Scanner(System.in);
        System.out.println("How old are you? reply on the format I am x years old");
        String s= scan.nextLine();

        String years="";

        for (int i = 0; i <s.length() ; i++) { // the loop will check which chars are int and then will create a substring with each of them.
            if(Character.isDigit(s.charAt(i))) {
                years += "" + s.charAt(i);
            }
        }
        int yearsInNums= Integer.parseInt(years);// String to nt using parse

        System.out.println("In 5 years you will be "+(yearsInNums+5));

       // Approach 2

       String agePart=s.split(" ")[2]; // String converted in to an array, and the accessing element 2 which will be the age part.
       int age=Integer.parseInt(agePart);// Then convert String to int using parse.
        System.out.println("In 5 years you will be "+(age+5));
    }
}
