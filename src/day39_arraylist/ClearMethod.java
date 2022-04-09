package day39_arraylist;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        System.out.println(nums);
        nums.clear();// empties the array
        System.out.println(nums);
        System.out.println(nums.size());// tells me the size, and since I cleared it, it is 0
        System.out.println(nums.isEmpty());//is it empty?? yes because I cleared it in line 13.


    }
}
