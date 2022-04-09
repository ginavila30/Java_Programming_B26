package day32arraysclassnandmulti;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {
        /*2d array
        print average of every array
        average of the whole array.
        * */
        int[][] nums={{3,4,5,6},{5,2,6},{10,20,30}};
        double sumOfOuterArrays=0;
        int totalLength=0;


        for (int[] eachArray:nums) {
            double sumOfInnerArrays=0;

            for (int eachNum:eachArray) {

                sumOfInnerArrays+=eachNum;



            }
            double averageInner=sumOfInnerArrays/eachArray.length;
            System.out.println(Arrays.toString(eachArray)+"Average:"+averageInner );
            totalLength+=eachArray.length;// summing all the lengths t know how many elements in total.
            sumOfOuterArrays+=sumOfInnerArrays;



        }
        System.out.println("Total Average: "+sumOfOuterArrays/ totalLength);


    }

}
