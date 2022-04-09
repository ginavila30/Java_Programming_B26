package day39_arraylist;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        nums.remove(0);
        System.out.println(nums);
        // nums.remove(500);//java read 500 as an int and there is no index 500 so below I convert int to integer.
        Integer i = 500;// convert int to Integer autoboxing
        nums.remove(i);//now I can use remove method because I am removing by object.
        nums.remove(Integer.valueOf(200)); // value of returns wrapper class type(object type) so this is another way to convert int to object.
        nums.remove((Integer) 800);// casting is another option.
        System.out.println(nums);// above I removed all the elements.
    }
}
