package day32arraysclassnandmulti;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {
        int[]array={30,90,60,360,180};
        int[]array2={180,360,30,90,60};

        // printing entire array, it returns a String. I need to print it, so I can see what it returns.

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        // checking if they ar equals, which means they should be same, same values in same position.
        System.out.println(Arrays.equals(array,array2));//False, they are not same here.

        // Now I sort them to see if they are equal after sorting.
       // First I sort then I print it to see the result.
        // sorting method does not give you anything back.
        Arrays.sort(array);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array));// printing to see array sorted.
        System.out.println(Arrays.toString(array2));// printing to see array sorted.
        System.out.println(Arrays.equals(array,array2));// True after sorting they are identical, same values in same positions.

        //Using join method below, and it only works with String arrays.
        String[]words={"Hello","Java","Saturday"};
        System.out.println(String.join("###",words));
    }
}
