package day23_loops;

import java.util.Scanner;

public class SyllablesLoops {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the info separating each syllable with -");
        String word= scan.nextLine();
        int total=1; // we started from 1 assuming that by the time the first - is found,  1 word was already counted. We could also do it by starting from 0 and adding 1 on line 20to the  total. As we did in Class count words.

        for(int i =0;i<word.length();i++){

            if(word.charAt(i)=='-'){
                total++;
            }

        }
        System.out.println("Total Syllables: "+total);
    }
}
