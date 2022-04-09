package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExplanation {
    public static void main(String[] args) {
        System.out.println("=== First way to create ArrayList====");
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);

        System.out.println("=== 2nd way to create ArrayList====");
        ArrayList<Integer> nums2 = new ArrayList<>(nums1); // we are assigning nums1 ArrayList to nums2 ArrayList, Similar to .copyOf Array method

        System.out.println("=== 3nd way to create ArrayList====");

        Integer [] arr1 = {10, 20, 30, 40}; // we can store normal Array into ArrayList by using Arrays.asList(Array);
        ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(arr1));

        System.out.println("=== 4nd way to create ArrayList====");
        ArrayList<Integer> nums4 = new ArrayList<>(Arrays.asList(30, 45, 50, 67, 99)); // we can declare a new ArrayList and store multiple elements at the same times by using Arrays.asList(element, element,...); we store many elements in the arg()


        System.out.println(nums1); // [1, 2]
        // .add();
        // we have 2 ways to use .add():
        // .add(element); // element is being added at the end of the ArrayList
        // .add(index, element) -> this one we define where exactly we want to add the element
        //syntax: ArrayListName.add(element);
        // .add(); it will return "true" if you try to print it

        nums1.add(30); // so 30 will be at the end of this ArrayList
        nums1.add(0,99); // this one we wanted to add the element which is 99 to the index of 0
        System.out.println(nums1.add(80)); // will print/return "true", it confirmed that this element has been added
        // .get(index);
        // it gets element base on index we have given in the arg() and return the element
//        System.out.println(nums1.get(99)); this will be outofbound because there is no index 99
        System.out.println(nums1.get(0));  // at the index of 0 we have 99 as the element

        // .size();
        // we use this method to get the size/length of the ArrayList, no need to give anything in the arg()
        //return: int
        System.out.println(nums1.size()); // 5 is the size of nums1 ArrayList


        //.indexOf(element);
        //.lastIndexOf(element);
        // if the element given in the arg() is in the ArrayList then this will return indexNumber of the element
        // if the element given in the arg() is NOT in the ArrayList then this will return -1
        System.out.println(nums1.indexOf(99));  // this will return the index of 99
        System.out.println(nums1.indexOf(98)); // this will return -1

        //.remove()
        // .remove(index)-> this will remove the element at the index given.(Returns the element removed)
        //.remove(element)-> this will remove the element give.(Returns boolean)
        System.out.println(nums1);
        System.out.println(nums1.remove(0));
        System.out.println(nums1);
        Integer i=30; //nums1.remove(i);
        nums1.remove((Integer) 30);
        nums1.remove(Integer.valueOf(2));
        System.out.println(nums1);
        // .contains()-> checks if the array list contains a given element.
        //Returns boolean
        nums1.contains(80);//true
        //.clear()
        //clears the array list elements. Void method.
        nums1.clear();
        System.out.println(nums1);
        //.isEmpty() checks if the array list is empty
        // returns boolean
        System.out.println(nums1.isEmpty());// true
        //.set()-> works like replace
        //.set(index,element)-> replaces the element at the give index with the new element given
        nums1.add(15);
        System.out.println(nums1);
        nums1.set(0,99);
        System.out.println(nums1);
    }
}
