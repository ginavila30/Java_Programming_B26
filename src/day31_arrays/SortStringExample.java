package day31_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {
        String []arr={"java", "Hello", "$Dollar","4Four","five5", "Zebra","Hi"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
