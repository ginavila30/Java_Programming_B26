package day30_arrays;

public class LongestPalindrome {
    public static void main(String[] args) {
        String[]arr={"java", "longer word", "civic","apple", "racecar", "mom", "anna"};

        String longPalindrome="";

        for (String each :arr) {
            String word=each;
            String reversed="";

            for (int i = word.length()-1; i >= 0; i--) {
                reversed+=word.charAt(i);
            }
            if (word.equals(reversed)){
                if(word.length()>longPalindrome.length())
                { longPalindrome=word;}}
        }
        System.out.println(longPalindrome.isEmpty()?"No Palindrome":longPalindrome);
    }}

