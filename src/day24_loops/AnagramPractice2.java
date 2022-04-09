package day24_loops;

import java.util.Locale;

/*Anagram

                Given two Strings determine if they are anagram or not. Strings are anagram if
                        they are built up of the same characters
                 Ex:
                    listen vs silent
                    funeral vs  real fun
                    a gentleman vs elegant man

                 -> anagram
                 Hint: look up and use replaceFirst() method*/
public class AnagramPractice2 {
    public static void main(String[] args) {

        String str1="silent";

        String str2="listen";
        str1=str1.toLowerCase().trim().replace(" ","");
        str2=str2.toLowerCase().trim().replace(" ","");

        if(str1.length()==str2.length()){
        for (int i = 0; i < str1.length() ; i++) {
            if(str2.contains(""+str1.charAt(i))){str2=str2.replaceFirst(""+str1.charAt(i),"");}

        }

        if(str2.isBlank()){
            System.out.println("Words are anagram");}else {
            System.out.println("words are not anagram");
        }

    }else{
            System.out.println("words are not anagram");
        }
}}
