package day09_06_06_2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Task 03; Create a List of Maps and manipulate the data with map and list methods
public class ListOfMaps {
    public static void main(String[] args) {
        Map<Integer, Integer>map1=new HashMap<>();
        map1.put(1,3);
        map1.put(4,2);
        map1.put(3,4);
        Map<Integer, Integer>map2=new HashMap<>();
        map2.put(5,3);
        map2.put(6,2);
        map2.put(7,8);
        Map<Integer, Integer>map3=new HashMap<>();
        map3.put(15,3);
        map3.put(6,21);
        map3.put(7,3);

        List<Map<Integer,Integer>>list=new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);

        for (Map<Integer,Integer> each:list) {
            System.out.println(each);
            each.replace(6,2,1);
        }




    }
}
