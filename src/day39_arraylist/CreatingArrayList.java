package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CreatingArrayList {
    public static void main(String[] args) {

        ArrayList<String>listOne=new ArrayList<>();
        listOne.add("hello");
        listOne.add("bye");
        listOne.add("hello");
        System.out.println(listOne);
        ArrayList<String>listTwo=new ArrayList<>(listOne);// creating an array list using the values from an already created array list
        listTwo.add("Hola");
        System.out.println(listOne);
        System.out.println(listTwo);
        ArrayList<String>listThree=new ArrayList<>(Arrays.asList("one","two","three"));
        System.out.println(listThree);
        String[]arr={"a","b","c"};
       // ArrayList<String>listFour=new ArrayList<>(arr);// This does not work because I am entering the array object directly which is not a collection type. To fix it I need to do Arrays.aslist(arr)
        ArrayList<String>listFour=new ArrayList<>(Arrays.asList(arr));
        System.out.println(listFour);

    }
}
