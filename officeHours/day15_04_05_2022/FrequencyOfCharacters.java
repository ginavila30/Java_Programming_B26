package day15_04_05_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static String findFrequency(String str){

        String [] strArr = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strArr));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList());



        for (String each: list){

            if (!list2.contains(each+Collections.frequency(list,each))){
                list2.add(each+Collections.frequency(list,each));
            }
        }
        String result = "";

        for (String each:list2){
            result += each;
        }

        return result;
    }
}
