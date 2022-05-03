package testing_or_explanations.CodingPractice;

import java.util.Arrays;

public class MultipleOfTwo {

    public static int largestMultipleOf2(int[]arr){
     //   Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }

        for (int i = arr.length-1; i>=0 ; i--) {
            if(arr[i]%2==0){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(largestMultipleOf2(new int[]{1, 5, 8, 12, 19, 24, 29}));
    }
}
