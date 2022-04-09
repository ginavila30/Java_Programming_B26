package day23_loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the word");
        String word= scan.nextLine().toLowerCase();
        char charToCheck='b';
        int count=0;

        for ( int i=0;i<word.length();i++){
            if(word.charAt(i)==charToCheck){count++;}
        }
        System.out.println("We found "+count+" "+charToCheck);


    }

}
