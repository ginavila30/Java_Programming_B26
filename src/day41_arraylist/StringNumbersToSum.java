package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class StringNumbersToSum {
    public static ArrayList<Integer>stringNumToSum(ArrayList<String>nums){
ArrayList<Integer>sums=new ArrayList<>();
        for (String each:nums) {
            Integer sum = getInteger(each);
            sums.add(sum);
        }
return sums;
    }
// I extracted the method below from method above to improve readability (select, right click, refactor, extract method. Make sure you select the right parenthesis.)
    private static Integer getInteger(String each) {
        Integer sum=0;


        for (String eachDigit: each.split("")) {
            sum+= Integer.parseInt(eachDigit);
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<String>nums=new ArrayList<>(Arrays.asList("123", "34", "513"));
        System.out.println(stringNumToSum(nums));
    }
}
