package testing_or_explanations.CodingPractice;

import java.util.Arrays;

public class RotateToLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int positions =10 ;

        System.out.println(Arrays.toString(rotateLeft(arr, positions)));
    }

    public static int[] rotateLeft(int[]arr,int positions){
        int[] newArr = new int[arr.length];
        if (positions < 0) {
            System.err.println("invalid input for position");
        } else {
            if (positions > arr.length) {
                positions = positions % arr.length;
            }


            for (int i = positions, j = 0; i < arr.length; i++, j++) {
                newArr[j] = arr[i];
            }
            for (int i = newArr.length - 1, j = positions - 1; i >= newArr.length - positions; i--, j--) {
                newArr[i] = arr[j];
            }

        }
        return newArr;
    }
}
