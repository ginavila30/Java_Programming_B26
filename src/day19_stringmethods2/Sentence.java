package day19_stringmethods2;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence= scan.nextLine();

        System.out.println(sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length()-1));
    }
}
