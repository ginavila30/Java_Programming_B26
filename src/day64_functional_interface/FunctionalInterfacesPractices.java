package day64_functional_interface;

import day54_05_03_2022.creating.Create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class FunctionalInterfacesPractices {

    public static void main(String[] args) {
//  1.1 Create a function that can check if two array are equal and contains the same elemnts
//                ex: arr1 = {3,2,1}
//                    arr2 = {2,1,3}
//
//                output: true

        BiPredicate<int[], int[]> arraysAreEqual = (arr1, arr2) -> {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return arr1.equals(arr2);
        };

        /* 1.2 Create a function that can check if the first array contains all the elements of the second array:
                ex: arr1 = {1,2,3,4,5,6}
                    arr2 = {7,8}

                output: false
*/
        BiPredicate<int[], int[]> numArrayContainsArray = (arr1, arr2) -> {
            ArrayList<Integer> list = new ArrayList<>();
            for (int each : arr1) {
                list.add(each);
            }
            for (Integer each : arr2) {
                if (!list.contains(each)) {
                    return false;
                }
            }
            return true;
        };

        System.out.println(numArrayContainsArray.test(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3}));

        /*   1.1 Create a function that can returns the common characters of two strings
                ex: str1 = "Python"
                    str2 = "Wooden Spoon"

                output: on*/

        BiFunction<String, String, String> commonChars = (s1, s2) -> {
            String result = "";
            for (int i = 0; i < s2.length(); i++) {
                if (s1.contains("" + s2.charAt(i)) && !result.contains("" + s2.charAt(i))) {
                    result += s2.charAt(i);
                }
            }
            return result;
        };
        System.out.println(commonChars.apply("Python", "Wooden Spoon"));

        /*    1.2 Create a function that can return the common elements of two Lists of Integers*/

        BiFunction<List<Integer>, List<Integer>, List<Integer>> commonElements = (list1, list2) -> {
            ArrayList<Integer> result = new ArrayList<>();
            for (Integer each : list2) {
                if (list1.contains(each) && !result.contains(each)) {
                    result.add(each);
                }
            }

            return result;

        };
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 5));
        list1.replaceAll(n -> n + 2);
        System.out.println(list1);
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5));
        System.out.println(commonElements.apply(list1, list2));

    }
}
