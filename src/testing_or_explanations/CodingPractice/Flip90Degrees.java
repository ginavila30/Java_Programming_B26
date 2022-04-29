package testing_or_explanations.CodingPractice;

import java.util.Arrays;

/*java flip the picture (90 degree to the right) i.a. flip the first raw to make it last column && last column to make last raw

        /* int [][] cube = {

                          {11, 12, 13, 14},
                          {21, 22, 23, 24},
                          {31, 32, 33, 34},
                          {41, 42, 43, 44}

                          };

         */
public class Flip90Degrees {
    public static void main(String[] args) {
        int [][] cube = {

                {11, 12, 13, 14},//[41, 31, 21, 11]
                {21, 22, 23, 24},//[42, 32, 22, 12]
                {31, 32, 33, 34},//[43, 33, 23, 13]
                {41, 42, 43, 44}// [44, 34, 24, 14]

        };
        int[][]cubeCopy= new int[cube.length][cube[0].length];

        for (int i = 0, l= cube.length-1; i < cube.length ; i++,l--) {
            for (int j = 0; j < cube.length ; j++) {

                cubeCopy[j][l]=cube[i][j];
            }
        }
        for (int[] arr : cubeCopy) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
