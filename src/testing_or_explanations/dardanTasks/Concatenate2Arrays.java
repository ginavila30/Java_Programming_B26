package testing_or_explanations.dardanTasks;

import java.util.Arrays;

/*Array -- Concat two arrays
Write a return method that can concate two arrays*/
public class Concatenate2Arrays {
public static int[] concatenateArrays(int[]arr1,int[]arr2){
    int[]result=new int[arr1.length+arr2.length];
    for (int i = 0; i < arr1.length ; i++) {
        result[i]=arr1[i];
    }
    for (int i = arr1.length, j=0; i < result.length ; i++,j++) {
        result[i]=arr2[j];
    }
    return result;
}

    public static void main(String[] args) {
        System.out.println(Arrays.toString(concatenateArrays(new int[]{1, 2, 3, 4, 5}, new int[]{6, 7, 8, 9, 10})));
    }
}
