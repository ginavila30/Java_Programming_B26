package day32arraysclassnandmulti;

import java.util.Arrays;

public class Multiply {
    public static void main(String[] args) {
        int [][]array1={{1, 2, 3}, {2, 5, 10}, {0, 3, 20}};
        int [][]array2={{10, 4, 3},{5, 2, 7},{100, 20, 5}};

        int[][]result=new int[array1.length][array1[0].length];// In this case I must givesize of each inner array.
      //  {{0, 0, 0},{0, 0, 0},{0, 0, 0}}


        for (int i = 0; i <array1.length ; i++) {
            //{2,5,10}

            for (int j = 0; j < array1[i].length ; j++) {

               int multiplication= array1[i][j]*array2[i][j];
               // System.out.println(multiplication);
               result[i][j]=multiplication;

            }


        }
        System.out.println(Arrays.deepToString(result));

    }
}
