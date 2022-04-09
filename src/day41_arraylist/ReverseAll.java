package day41_arraylist;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Reverse All
Create a method that will take an ArrayList of Strings and reverse each element and return an ArrayList of
all reversed words
@param words - Given ArrayList of Strings @return - ArrayList of Strings
Ex:
Input: {} Output: {"det", "klat", "nrael"}
     */
public class ReverseAll {
public static ArrayList<String> reverseAll(ArrayList<String> list){

        ArrayList<String> reverseWords = new ArrayList<>();

        for(String each : list){

            reverseWords.add(StringUtil.reverseString(each));
            // We call the reverse method in StringUtil class to reverse each word, each element, then we are adding the reversed word into the 'reverseWords' ArrayList
        }

        return reverseWords;

    }

    public static void main(String[] args) {
    ArrayList<String>list=new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(reverseAll(list));
    }


//    Second Approach
//    public static ArrayList<String> reverseArrayElements(ArrayList<String>words){
//        for (int i = 0; i < words.size() ; i++) {
//            String each= words.get(i);
//            String newEach="";
//            for (int j = each.length()-1; j >=0 ; j--) {
//                newEach+=each.charAt(j);
//            }
//            words.set(i,newEach);
//        }
//        return words;
//
//    }


}
