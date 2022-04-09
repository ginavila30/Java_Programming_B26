package day32arraysclassnandmulti;

import java.util.Arrays;

public class AverageEachTradLoop {
    public static void main(String[] args) {
        /*2d array
        print average of every array
        average of the whole array.
        * */
        int[][] nums={{3,4,5,6},{5,2,6},{10,20,30}};
        double sumOfOuterArrays=0;
        int totalLength=0;


        for(int i=0; i< nums.length; i++)  {
            double sumOfInnerArrays=0;

            for (int j=0;j<nums[i].length;j++){
                sumOfInnerArrays+=nums[i][j];// 2 straight brackets one for the index of the array and teh other one for the index of the element inside the array.



            }
            double averageInner=sumOfInnerArrays/nums[i].length;
            System.out.println(Arrays.toString(nums[i])+"Average:"+averageInner );
            totalLength+=nums[i].length;// summing all the lengths t know how many elements in total.
            sumOfOuterArrays+=sumOfInnerArrays;



        }
        System.out.println("Total Average: "+sumOfOuterArrays/ totalLength);


    }

}
