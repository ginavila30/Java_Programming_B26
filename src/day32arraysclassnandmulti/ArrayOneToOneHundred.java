package day32arraysclassnandmulti;

import java.util.Arrays;

public class ArrayOneToOneHundred {
    public static void main(String[] args) {
        int [][]multiArr=new int[10][10];

        int count = 1;

        for (int i = 0; i < multiArr.length ; i++) {

            for (int j = 0; j <multiArr[i].length ; j++) {

                multiArr[i][j]=count++;

            }
            System.out.println(Arrays.toString(multiArr[i]));

        }
        System.out.println(Arrays.deepToString(multiArr));

    }
}
