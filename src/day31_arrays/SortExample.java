package day31_arrays;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int[]nums={3,6,2,68,32,-2,24};
        int []notSorted=nums;// does not make a new array object, it is just a reference linked to the same object.
        Arrays.sort(nums); // once I use sort method I modify my array, and I can't access the original one.
        System.out.println(Arrays.toString(nums));

        // Q: max and min from array
        System.out.println("Min: "+nums[0]);
        System.out.println("Max: "+nums[nums.length-1]);
    }
}
