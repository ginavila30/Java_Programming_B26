package day60_collections;

import java.util.*;

public class SetVsList {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();// indexes, duplicates, insertion order, internally array, ideal for store and access data.
        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(10);
        list.add(4);
        System.out.println(list);
        System.out.println("First: "+list.get(0));

        Set<Integer> set=new HashSet<>();// no indexes, no duplicates, no insertion order.
        set.add(4);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(10);
        set.add(4);
        System.out.println(set);
        //System.out.println("First: "+set.get(0));// get method does not work because there are no indexes

        for(int each:set){
            System.out.println(each);

        }
        //sort my hashset
        System.out.println(new TreeSet<>(set));
        //converting list to set, will also remove duplicates, will give random order
        System.out.println(new HashSet<>(list));
        //converting list to set, remove duplicates but maintain insertion order
        System.out.println(new LinkedHashSet<>(list));

        String s="aaaaaaabbbbbbbcccccccdddddd";
        System.out.println(new HashSet<>(Arrays.asList(s.split(""))).toString().replace(", ","").replace("[","").replace("]",""));

        //Converted String to array by split method. Also we passed that array as a collection with Arrays.aslist, then the list was the argument to make a hashset object, which eliminates the duplicates and gives random order.we use replace method to get rid of [] characters and make it a simple String.


    }
}
