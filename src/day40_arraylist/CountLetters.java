package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CountLetters {
    public static int countLetters(ArrayList<String> list, char charToCheck) {
        int count = 0;
        for (String each : list) {

            for (int i = 0; i < each.length(); i++) {
                if (each.charAt(i) == charToCheck) {
                    count++;
                }
            }
        }
        return count;
    }
    // Approach using collections method frequency
//    public static int countLetters2(ArrayList<String> list, char charToCheck) {
//       int count =0;
//        for (String each :list) {
//            String[] arr=each.split("");
//            String check=""+charToCheck;
//            ArrayList<String>letter=new ArrayList<>(Arrays.asList(arr));
//
//            count+=Collections.frequency(letter,check);
//
//        }
//        return count;
//    }

    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript","selenium"));
        System.out.println(countLetters(list, 'a'));

       // System.out.println(countLetters2(list, 'a'));
    }
}
