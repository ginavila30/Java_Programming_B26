package testing_or_explanations.dardanTasks;

import java.util.Arrays;

/*Array -- Move Zeros to the End
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex: input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]*/
public class ArrayMoveZeroToEnd {
    public static int[] moveZeroToEnd(int[]arr){
        int[]result= new int[arr.length];
        for (int i = 0, j=0; i < arr.length ; i++) {
            if(arr[i]!=0){
                result[j++]=arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroToEnd(new int[]{1, 0, 2, 0, 3, 0, 4, 0})));
    }
}
