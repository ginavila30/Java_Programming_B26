package day38_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("water");
        list.add("Sun");
        list.add("Wind");
        list.add("Wood");
        System.out.println(list);
        list.remove(0);// This one accepts the index number of the element
        System.out.println(list);// Method removed water
        list.remove(list.size()-1);// removed last element - remove(last index)
        System.out.println(list);//[sun,wind]
        list.remove("sun");
        System.out.println(list);//[wind]
        System.out.println(list.remove("apple"));// Ths returns false, since there is no apple word to remove

    }
}
