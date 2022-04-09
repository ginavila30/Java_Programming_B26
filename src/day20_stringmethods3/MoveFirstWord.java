package day20_stringmethods3;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence= scan.nextLine().trim();
        int spaceIndex=sentence.indexOf(' ');
        String firstWord= sentence.substring(0,spaceIndex);
        String message= sentence.substring(spaceIndex+1);
        System.out.println(message+" "+firstWord);
    }
}
