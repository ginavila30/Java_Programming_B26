package day32arraysclassnandmulti;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        // To use binary search, array must be sorted smaller to bigger.
        int[]nums={4,10,30,100};// array was declared in a sorted way. if it wouldn't be like that I can use sort method.

        System.out.println(Arrays.binarySearch(nums,4));
        System.out.println(Arrays.binarySearch(nums,100));
        System.out.println(Arrays.binarySearch(nums,200));// Returns: -5. If the number does not exist in the array, it returns a negative value. And it tells where would it be if it would actually exist in the array. (which number of element it would be+1, and then make it negative)
        System.out.println(Arrays.binarySearch(nums,6));//Returns: -2
    }
}
