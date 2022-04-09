package day28_arraysIntro;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double[]arr=new double[4];// array size is fixed. I can't change it after I instantiate it. To modify size I have to make a new array.
        System.out.println(arr.length);//4
        System.out.println(Arrays.toString(arr));// prints te default value for double which is 0.0

        arr[0]= 30.99;
        System.out.println(Arrays.toString(arr));// Only first value was reassigned.
        arr[1]= 12.55;
        arr[2]= 10.20;
        arr[3]= 5;
        System. out. println(Arrays.toString(arr));// all values have been assigned and default values have been replaced.

        //Reassigning
        arr[2]=2000;
        System.out.println(Arrays.toString(arr));

        arr=new double[5]; // Created a new array with 5 elements, and assigned the arr reference to the new object, so I lost all my prev. data.
        System.out.println(Arrays.toString(arr));

    }
}
