package day61_maps;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {
        Map<String, String>map1=new HashMap<>();
        map1.put("saim","java");
        map1.put("hello", "world");
        map1.put("james", "bond");
        map1.put("nadir","softskills");
        map1.put("aysun","ui testing");
        map1.put("username","password");
        map1.put(null,"nothing");
        System.out.println(map1);
        
        Map<String,String>linked=new LinkedHashMap<>();
        linked.put("saim","java");
        linked.put("hello", "world");
        linked.put("james", "bond");
        linked.put("nadir","softskills");
        linked.put("aysun","ui testing");
        linked.put("username","password");
        linked.put(null,"nothing");
        System.out.println(linked);


        Map<String,String>treeMap=new TreeMap<>();
        treeMap.put("saim","java");
        treeMap.put("hello", "world");
        treeMap.put("james", "bond");
        treeMap.put("nadir","softskills");
        treeMap.put("aysun","ui testing");
        treeMap.put("username","password");
       // treeMap.put(null,"nothing"); //Treemap cant have null as key 
        System.out.println(treeMap);

        Map<String,String>table=new Hashtable<>();
        table.put("saim","java");
        table.put("hello", "world");
        table.put("james", "bond");
        table.put("nadir","softskills");
        table.put("aysun","ui testing");
        table.put("username","password");
      //  table.put(null,"nothing");//hashTable cant have null as key
        System.out.println(table);




    }
}
