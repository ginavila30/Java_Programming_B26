package testing_or_explanations.TopicReviews;

import java.util.HashMap;
import java.util.Map;

public class MapObjects {

    public static void main(String[] args) {
        Map<Integer,String> map1=new HashMap<>();
        //method to add in maps is put()
        map1.put(1,"Gina");
        map1.put(2,"simi");
        map1.put(3,"simi");
        map1.put(3,"elena");
        map1.put(null,null);
        map1.put(null,"ulugbek");
        System.out.println(map1);
        // get -> no index but instead key
        System.out.println(map1.get(3));
        // remove-> no index but instead key
        System.out.println(map1.remove(1));// return entry
        System.out.println(map1.remove(2, "simi"));// return boolean true because the entry exist
        System.out.println(map1.remove(3, "ulugbek"));// return boolean false, the entry does not exist.
        map1.put(1,"Nadir");
        map1.put(2,"Saim");
        map1.put(4,"Aysun");
        //contains-> by passing key or value
        System.out.println(map1.containsKey(2));// returns boolean
        System.out.println(map1.containsValue("mike"));//return boolean
        // iterating through a map
        //keyset()
        System.out.println(map1.keySet());// set which is child of iterable
        for (Integer each:map1.keySet()) {
            System.out.println(each+ " "+ map1.get(each));
        }
        //values()
        System.out.println(map1.values());// collection of the values in my map
        for (String eachValue:map1.values()) {
            System.out.println(eachValue+" "+eachValue.length());
        }
        //entrySet()
        System.out.println(map1.entrySet());// returns a set fo all the entries in my map
        for (Map.Entry<Integer, String> each: map1.entrySet()) {
            System.out.println(each);
        }

    }
}
