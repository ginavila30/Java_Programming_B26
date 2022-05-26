package testing_or_explanations.TopicReviews;

import java.util.*;

public class IteratorAndMapsReview {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>(Arrays.asList("a","b","c","d","e"));
        Iterator<String> it= list.iterator();
        System.out.println(it.next());// -> gets current element
        it.remove();//-> removes next ("it.next()) element
        // System.out.println(it.next());
        System.out.println(it.hasNext());//-> checks if there\
        System.out.println(list);

        while (it.hasNext()){
            System.out.println(it.next());
        }

        Map<Integer, Integer> map=new HashMap<>();
        map.put(1,3);
        map.put(4,1);
        map.put(5,2);
        map.put(6,8);
        System.out.println("-------------looping by using keyset collection------------");
        for (Integer each:map.keySet()) {
            System.out.println(each +"" + map.get(each));
        }
        System.out.println("------------looping by using values collection---------------");
        for (Integer each:map.values()) {
            System.out.println(each);
        }
        System.out.println("-------looping by using entryset----------------------");

        for (Map.Entry<Integer,Integer> each:map.entrySet()) {
            System.out.println(each);
        }
        Map<Integer, Integer> map3=new LinkedHashMap<>();//allows null as key and as value
        map3.put(null,5);


        Map<Integer, Integer> map4=new HashMap<>();//allows null as key and as value
        map4.put(null,null);


        Map<Integer, Integer> map1=new TreeMap<>();// no null as key but ok for value
        System.out.println(map1.put(4, null));

        Map<Integer, Integer> map2=new Hashtable<>();//no null at all
        System.out.println(map2.put(5,5));


    }
}
