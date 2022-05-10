package day05_05_09_2022;

public class EqualSumLeftAndRight {
    public static void main(String[] args) {
       int[]arr= {4, 1, 3, 6, 4};
       equalSumRightAndLeft(arr);
    }

    public static int equalSumRightAndLeft(int[]arr){

        int leftSum=0;


        for (int i = 0; i < arr.length ; i++) {
            int rightSum=0;
            for (int j = i+1; j < arr.length ; j++) {
                rightSum+=arr[j];
            }
            if(leftSum==rightSum){
               return arr[i];

            }
            leftSum+=arr[i];

        }

        return -1;
    }
}
