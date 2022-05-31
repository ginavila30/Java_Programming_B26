package testing_or_explanations.dardanTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/*Array -- Find Maximum
Write a method that can find the maximum number from an int Array

Array -- Find Minimum
Write a method that can find the maximum number from an int Array*/
public class FindMinAndMaxIntegerArr {
    public static void main(String[] args) {
        Function<int[],Integer> findMaxNum= arr->{
           int max= arr[0];
            for (int i = 1; i < arr.length ; i++) {
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        };

        Function<int[],Integer>findMinNum= arr->{
            List<Integer> list=new ArrayList<>();
            for (int each:arr) {
                list.add(each);
            }
             return Collections.min(list);
        };

        System.out.println(findMaxNum.apply(new int[]{5, 6, 9, 3, 9, 4}));
        System.out.println(findMinNum.apply(new int[]{5, 6, 9, 3, 9, 4}));
    }
}
