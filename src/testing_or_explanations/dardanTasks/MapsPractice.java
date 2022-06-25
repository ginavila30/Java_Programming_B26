package testing_or_explanations.dardanTasks;

import java.util.*;

/*Questions for next week

Map -- Sort the map by values
Write a method that can sort the Map by values



Map -- Min value
Write a method that can return the minimum value from ta map (DO NOT use sort method)*/
public class MapsPractice {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("apple"));
        System.out.println(uniqueChars("apple"));
        Map<Integer,Integer>map=new HashMap<>();
        map.put(2,4);
        map.put(1,-3);
        map.put(9,8);
        map.put(3,2);
        map.put(25,1);
        map.put(26,1);
        System.out.println(minimumValue(map));
        System.out.println(sortByValue(map));
    }
    public static Map<String,Integer> frequencyOfChars(String str){
        Map<String, Integer>map=new LinkedHashMap<>();
        ArrayList<String>list=new ArrayList<>(Arrays.asList(str.split("")));
        for (String each:list) {
            map.put(each,Collections.frequency(list,each));
        }
        return map;
    }
    public static Map<String,Integer> uniqueChars(String str){
        Map<String, Integer>map=new LinkedHashMap<>();
        ArrayList<String>list=new ArrayList<>(Arrays.asList(str.split("")));
        for (String each:list) {
            if(Collections.frequency(list,each)==1)
            map.put(each,Collections.frequency(list,each));
        }
        return map;
    }
    public static int minimumValue(Map<Integer,Integer>map) {
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> each : map.entrySet()) {
            if (each.getValue() < min) {
                min = each.getValue();
            }
        }
        return min;
    }
    public static Map <Integer,Integer> sortByValue(Map<Integer,Integer>map){
        Map<Integer,Integer>returnMap=new LinkedHashMap<>();
        while(map.size()>0){
            Integer minVal=Integer.MAX_VALUE;
            Integer minKey=Integer.MAX_VALUE;
            for (Map.Entry<Integer, Integer> each : map.entrySet()) {
                if (each.getValue() <= minVal) {
                    minVal = each.getValue();
                    minKey= each.getKey();
                }
        }
            returnMap.put(minKey,minVal);
            map.remove(minKey);
    }
        return returnMap;
}

}
