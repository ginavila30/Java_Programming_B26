package testing_or_explanations.CodingPractice;

import java.util.Arrays;

public class MultidimensionalPractice {
    /*
Given two 2D arrays multiply them together and store the results into a
new 2D array. Multiply each number in each position as its own calculation
Ex:
{1, 2, 3} {2, 5, 10}{0, 3, 20}
x
{10, 4, 3}{5, 2, 7}{100, 20, 5}
Output:
{10, 8, 9}{10, 10, 70}{0, 60, 100}
 */
    public static void main(String[] args) {
        int[][]arr1={{1, 2, 3},{2, 5, 10},{0, 3, 20},{2,8,6}};
        int[][]arr2={{10, 4, 3},{5, 2, 7},{100, 20, 5},{1,1,1}};
        int [][]result= Arrays.copyOf(arr1,arr1.length); //copying {{10, 8, 9},{2, 5, 10},{0, 3, 20},{2,8,6}}


        for (int i = 0 ; i < arr1.length ; i++) {
         //1

            for (int j = 0; j <arr1[i].length  ; j++) {

                result[i][j]= arr1[i][j] * arr2[i][j];// reassigning values


            }

        }
        System.out.println(Arrays.deepToString(result));



    }
}
