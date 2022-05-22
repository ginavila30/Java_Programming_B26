package day61_maps;

import java.util.HashMap;
import java.util.Map;

public class HasMapObject {
    public static void main(String[] args) {
        //Keys are Integer, and values are String
        Map<Integer, String>map1=new HashMap<>();//Hashmap is random order
        //map1.add(); not valid because it is not from collection type.
        map1.put(1,"one");
        map1.put(3,"three");
        map1.put(10,"ten");
        map1.put(5,"five");
        System.out.println(map1);//Hashmap element order is random, not insertion order, not sorted.

        //read key/value from map
        System.out.println(map1.get(map1.get(10)));
        String value= map1.get(5);

        map1.remove(1); //removes whole entry paired with this key.
        System.out.println(map1);

        //2 options for contains, searching by key or by the value
        System.out.println(map1.containsKey(1));
        System.out.println(map1.containsKey(3));
        System.out.println(map1.containsValue("five"));
        System.out.println(map1.containsValue("10"));

        //accepts null as key one time, but if I use it again it will just update the entry that has null. Since it does not accept duplicates
        map1.put(null,null);
        System.out.println(map1);
        map1.put(null,"hello");
        System.out.println(map1);
        map1.put(15,"hello");
        System.out.println(map1);
    }
}
