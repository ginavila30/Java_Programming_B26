package day08_03_09_2022;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter two words");
        String word1=scan.nextLine().replace(" ","").toLowerCase();// listen
        String word2= scan.nextLine().replace(" ","").toLowerCase();//silent

        if (word1.length()==word2.length()){ // First thing to do is check if they have same length. If different length they can not be anagram.

        for (int i = 0; i < word1.length(); i++) {

            if(word2.contains(word1.substring(i,i+1))){word2=word2.replaceFirst(""+word1.charAt(i),""); } // replacing for empty space makes me heck that if all the characters are same and are replaced the words ar anagram. If at least one of the chars is not replace by "" then it is not anagram.


        }
        if(word2.isEmpty()){
            System.out.println("Words are anagram");
        }else{
            System.out.println("words are not anagram");
        }

    }else{
            System.out.println("Words are not anagram");
        }
    }}
