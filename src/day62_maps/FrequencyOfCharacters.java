package day62_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    /*Using Map*/
    public static void main(String[] args) {
        frequencyOfCharacters("banana");


    }

    public static void frequencyOfCharacters(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
        }

        System.out.println(map);
    }
}
