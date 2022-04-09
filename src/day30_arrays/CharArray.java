package day30_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j','a','v','a'};
        String word="java";
        char[]java= word.toCharArray();
        System.out.println(Arrays.toString(letters)); // Prints the entire array.
        System.out.println(Arrays.toString(java)); // prints String as an array.
        System.out.println(letters);// Only a char array can be printed directly. And will print as a regular String. This is because of what happens behind scenes between strings and chars.

        for(char eachChar:java){ // for( char eachChar:word.toCharArray()){} This is an example that I can use a regular String can be use as char array.

            System.out.println(eachChar);
        }

        // Convert a char array to string

        char [] day ={'m', 'o', 'n', 'd', 'a', 'y'};

        String strDay=new String(day);// This converts the char array to String.
        System.out.println(strDay);
        System.out.println(day);// This will print my array as a String but because it was not formally converted to String I can not use string methods to manipulate.

    }
}
