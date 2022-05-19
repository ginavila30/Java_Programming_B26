package day59_05_17_2022;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetObjects {
    public static void main(String[] args) {
        Set<String>set=new HashSet<>();// not order guarantee, its random
        set.add(null);
        set.add("hello");
        set.add("$4.5");
        set.add("400");
        set.add("hello");
        set.add("%");
        System.out.println(set);
        Set<String>set2=new LinkedHashSet<>();// insertion order maintained
        set2.add(null);
        set2.add("hello");
        set2.add("$4.5");
        set2.add("400");
        set2.add("hello");
        set2.add("%");
        System.out.println(set2);
        Set<String>set3=new LinkedHashSet<>();// sorts in ascending order
      //  set3.add(null); not allowed in treeset
        set3.add("hello");
        set3.add("$4.5");
        set3.add("400");
        set3.add("hello");
        set3.add("%");
        System.out.println(set3);


    }
}
