package day37_wrapperclass;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        System.out.println(numbers);// for Array list no need to call a method to print it I just put the name in the ().
        numbers.add(100);// adds 100 to the end of the ArrayList and automatically is doing autobox for us. Taking 100 int and converting it in to Integer object so that I can be handled by Array list.
        System.out.println(numbers);
        numbers.add(-100);
        System.out.println(numbers);
        numbers.add(50);
        numbers.add(23);
        System.out.println(numbers);
        // to access each element, I use method .get  /  not arr[index] format we use with arrays.
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(numbers.size()-1));
        // When index is not valid, out of bounds.
        System.out.println(numbers.size());// .size method is what we use to know the size of the Array list. How many elements.
    }
}
