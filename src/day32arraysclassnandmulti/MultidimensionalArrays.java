package day32arraysclassnandmulti;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[]n={5,10,20,10};
        int[]m={5,10,100,39,19};

        int[][]all={n,m};// created multidimensional array with the single arrays declared in line 7 and 8.
        System.out.println(Arrays.deepToString(all));// deepToString, is the method to print multidimensional arrays entirely.
        System.out.println(Arrays.toString(all[0])); // Here I am printing only the array in index 0, so I use to string method.
        System.out.println(Arrays.toString(all[1])); // Here I am printing only the array in index 0, so I use to string method.
        System.out.println("-----------------");
        int[][]multi={{90,80,70},{19,51,1129,12},{10,1900},{14}};//  ArrayIndex :   index 0     index 1         index 2   index 3

        System.out.println(multi.length);// prints the size of multi array.
        System.out.println(multi[0].length);// prints the size of index of array inside multi array.
        System.out.println(multi[0][1]);// Accessing element 1 of array in index 0.


    }
}
