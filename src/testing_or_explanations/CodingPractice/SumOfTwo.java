package testing_or_explanations.CodingPractice;

import java.util.Arrays;

public class SumOfTwo {
    public static int[] sumOfTwo(int[]arr, int num){
        int[] newArr=new int[2];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]+arr[j]==num){
                    newArr[0]=arr[i];
                    newArr[1]=arr[j];
                }
            }
        }
return newArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfTwo(new int[]{13, 43, 2, 71}, 84)));
    }
}
