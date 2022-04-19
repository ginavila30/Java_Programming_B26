package testing_or_explanations.CodingPractice;
/*Find the second min/max number from an array. Write a method that accepts int array as an argument and returns
second or n min/max number from the given array.*/

import java.util.Arrays;

public class FindMinOrMaxFromArray {
    public static int find2ndMin(int[]arr){
        //{2,5,3,1,5}
        // 5,2,3,1,5

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(arr[j]>arr[i]){
                    int temp=arr[i];//2
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr[1];
    }
    public static int find2ndMax(int[]arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr[1];
    }

    public static void main(String[] args) {
        System.out.println(find2ndMin(new int[]{3, 6, 4, 8, 9,3}));
        System.out.println(find2ndMax(new int[]{3, 4, 7, 2, 8, 5, 9}));
    }
}
