package day04_04_25_2022;

import java.util.Arrays;

/*  Task 02 ; - Create a method that returns the 4th largest number of given int array

       Eg;  int[] arr  ={2 , 56 , 0 , 25 , 1 , 75 , 9 , 8}; ---> 9
            int[] arr2 ={1 , 2 , 3 , 9 , 0 };  ---> 1*/
public class FourthLargestNum {
    public static int fourthLargestNum(int[]arr){

        if(arr.length>=4){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[3];}else{
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] arr  ={2 , 56 , 0 , 25 , 1 , 75 , 9 , 8};
        System.out.println(fourthLargestNum(arr));
    }
}
