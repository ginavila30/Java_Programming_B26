package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPalindrome {
    public static ArrayList<String> allPalindrome(ArrayList<String>list){
        ArrayList<String>palindromeWords=new ArrayList<>();
        for (String each:list) {
            String reverse="";
            for (int i = each.length()-1; i>=0 ; i--) {
                reverse+=each.charAt(i);
            }
            if(each.equalsIgnoreCase(reverse)){
                palindromeWords.add(each);
            }
        }
        return palindromeWords;
    }

    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("Anna", "Java", "Python", "Racecar", "Level", "Cydeo", "Eye"));
        System.out.println(allPalindrome(list));
    }
}
