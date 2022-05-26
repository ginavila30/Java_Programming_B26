package day62_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {
    public static void main(String[] args) {
        /*
        * People
        *  First_Name:James
        * Last_Name:Bond
        * Batch:7
        * */

        Map<String,String> map=new HashMap<>();
        map.put("FIRST_NAME","James");
        map.put("LAST_NAME","James");
        map.put("BATCH","7");

        System.out.println(map);

        List<Map<String, String>> list= new ArrayList<>();// My list data type is a MAP since Map is an object
        list.add(map);//I use ArrayList methods to add elements
        list.add(makeMap("Shina", "Alhusaini", "26"));//I add elements by using makeMap method line 30.
        list.add(makeMap("Gina", "Sodavi", "27"));
        list.add(makeMap("Simi", "milo", "19"));
        list.add(makeMap("Elena", "vinoki", "28"));
        list.add(makeMap("Majid", "sodavi", "16"));

        System.out.println(list.get(1).get("FIRST_NAME"));//Get element on index 1 of the ArrayList, then get the value by passing the key wanted
        System.out.println(list.get(1).get("LAST_NAME"));
        System.out.println();
        //Go through Arraylist of Map elements and print each element

        for (Map<String, String> each:list) {
            System.out.println(each);
        }
        System.out.println();
        //Go through ArraList of Map elements and get the value of FIRST_NAME Key

        for (Map<String, String> each:list) {
            System.out.println(each.get("FIRST_NAME"));
        }
        System.out.println();
//Go through ArraList of Map elements and get NAMES of the ones that are batch 20 and above
        for (Map<String, String> each:list) {
            if(Integer.parseInt(each.get("BATCH"))>=20){
                System.out.println(each.get("FIRST_NAME"));
            }
        }
        System.out.println();
        //information of last person in my ArrayList

        System.out.println(list.get(list.size()-1).get("FIRST"));




    }
    public static Map<String, String> makeMap (String ... values){ //var args ARRAY OF STRING I can ad multiple arguments
        Map<String, String> map = new HashMap<>();
        map.put("FIRST_NAME", values[0]);
        map.put("LAST_NAME", values[1]);
        map.put("BATCH", values[2]);
        return map;
    }
}
