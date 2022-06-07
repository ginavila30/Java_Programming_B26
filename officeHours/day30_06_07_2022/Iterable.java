package day30_06_07_2022;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    public static void main(String[] args) {

         /*
        Remove names from list if the length smaller than 6 or  name startswith M

         */
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Mehmet", "Toghrul", "Olga", "John", "Erjon", "Daniel", "Emre", "Kamil"
        ));
        //option 1 using iterator
//        Iterator<String>it= names.iterator();
//
//        while (it.hasNext()){
//            String currentName= it.next();
//            if(currentName.length()<6||currentName.startsWith("M")){it.remove();}
//        }
//
//        System.out.println(names);
        //Option 2 using remove if-> internally works with iterator
        names.removeIf(each->each.length()<6||each.startsWith("M"));
        System.out.println(names);







    }
}
