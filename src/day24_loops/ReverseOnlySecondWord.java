package day24_loops;

import java.util.Scanner;

public class ReverseOnlySecondWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence= scan.nextLine().trim();
        int firstIndex=sentence.indexOf(' ');
        int lastIndex=sentence.lastIndexOf(' ');// I could use str.indexOf(" ",firstIndex+1); which finds the first index of space starting to  look from the index given after the comma.
        String sub=sentence.substring(firstIndex+1,lastIndex);//love
        String reversed="";

        for (int i = sub.length()-1; i >=0 ; i--) {

            reversed+=sub.charAt(i);

        }
        System.out.println(""+sentence.substring(0,firstIndex+1)+reversed+ sentence.substring(lastIndex));// used concatenate
        System.out.println(sentence.replace(sub,reversed));// used replace method to enter the new word.


    }
}
