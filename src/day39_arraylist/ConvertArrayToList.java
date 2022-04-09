package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {
        Integer[]arr={1,1,3};

        Arrays.asList(arr);// convert an Integer array in to a collection.

        ArrayList<Integer>nums=new ArrayList<>(Arrays.asList(arr));// take an array and make it array list. long approach
        System.out.println(nums);

        ArrayList<Integer>other=new ArrayList<>(Arrays.asList(4,5,6,7));//creating array list with some initial values
        System.out.println(other);
    }
}
