package day29_arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int [] numbers ={10,0,5,0,1,0};
        int [] result= new int[numbers.length];
        int position = 0; // Variable to keep track of he indexes of the result array.


        for (int i =0; i< numbers.length; i++){
           if (numbers[i]!=0){
               result[position++]=numbers[i];}
        }

        System.out.println(Arrays.toString(result));
    }
}
