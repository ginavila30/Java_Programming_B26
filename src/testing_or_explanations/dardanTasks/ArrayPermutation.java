package testing_or_explanations.dardanTasks;

import java.util.ArrayList;
import java.util.List;

/*Array -- permutation combinations
Given an array of 3 characters print all permutation combinations from the given characters*/
public class ArrayPermutation {
    public static List<String> charPermutation(char[]arr){
      List<String>list=new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {//abc
            String permutation=""+arr[i];

            for (int j = 0; j < arr.length ; j++) {//abc
                if(i!=j){
                    permutation+=arr[j];
                }
            }
            list.add(permutation);

            permutation=""+arr[i];
            for (int j = arr.length-1; j >=0 ; j--) {//abc
                if(i!=j){
                    permutation+=arr[j];
                }
            }
            list.add(permutation);



        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(charPermutation(new char[]{'A', 'B', 'C'}));
    }

}
