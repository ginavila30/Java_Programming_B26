package day59_05_17_2022;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjects {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();// using polymorphism by using reference List interface and create ArrayList obj.
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add(null);
        list.add("a");
        System.out.println(list);
        System.out.println(list.get(3));

        List<String>list2=new LinkedList<>();//using polymorphism by using reference List interface and create LinkedList obj.
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("e");
        list2.add(null);
        list2.add("a");
        System.out.println(list2);
        System.out.println(list.get(3));

        List<String>list3=new Vector<>();//using polymorphism by using reference List interface and create LinkedList obj.
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        list3.add("e");
        list3.add(null);
        list3.add("a");
        System.out.println(list3);
        System.out.println(list.get(3));



    }
}
