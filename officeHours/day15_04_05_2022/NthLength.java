package day15_04_05_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLength {
    public static int nthLargestNum (ArrayList<Integer>numbers,int n) {

        ArrayList<Integer> newNumbers = new ArrayList<>();
        for (Integer each : numbers) {
            if (newNumbers.contains(each)) {
                continue;
            } else {
                newNumbers.add(each);
            }
        }
        Collections.sort(newNumbers);
        Collections.reverse(newNumbers);
        return newNumbers.get(n-1);
    }

    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7, 7 ,8, 8));
        System.out.println(nthLargestNum(nums, 6));
    }
}
