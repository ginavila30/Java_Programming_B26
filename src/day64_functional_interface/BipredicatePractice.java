package day64_functional_interface;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BipredicatePractice {
    public static void main(String[] args) {
        BiPredicate<Integer[],Integer> arrayContains = (arr, num)->{
            for (int each:arr) {
                if(each==num){
                    return true;
                }
            }
            return false;
        };

        System.out.println("arrayContains.test(new Integer[]{2,5,8,76},5) = " + arrayContains.test(new Integer[]{2, 5, 8, 76}, 5));
        System.out.println("arrayContains.test(new Integer[]{2, 5, 8, 76}, 1) = " + arrayContains.test(new Integer[]{2, 5, 8, 76}, 1));

        BiPredicate<String, String>anagram=(one,two)->{
            char[]oneArr= one.toCharArray();
            char[]twoArr=two.toCharArray();
            Arrays.sort(oneArr);
            Arrays.sort(twoArr);
            return  Arrays.equals(oneArr,twoArr);
        };

        System.out.println(anagram.test("silent", "listen"));
    }
}
