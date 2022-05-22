package day61_maps;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Jmaes");
        names.add("emre");
        names.add("bruce");

        Iterator<String> it=names.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
       // System.out.println(it.next());//returns exception because elements are only 3

    }
}
