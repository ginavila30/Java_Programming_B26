package day64_functional_interface;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionPractice {
    public static void main(String[] args) {
        BiFunction< Integer,Integer ,Integer> maxNum=(one ,two )->{
            return one>two?one:two;
        };

        System.out.println(maxNum.apply(5, 89));
        BiFunction<List<Integer>,List<Integer>, Map<Integer,Integer>>createAMap=(list1,list2)->{
            Map<Integer,Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < list1.size() ; i++) {
                if(!map.containsKey(list1.get(i))){
                    map.put(list1.get(i),list2.get(i));}
                else{map.put(list1.get(i),map.get(list1.get(i))+1);}
            }

            return map;
        };
        ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(1,2,3,4,5,1));
        ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(1,2,3,4,5,1));
        System.out.println(createAMap.apply(list1, list2));
    }

}
