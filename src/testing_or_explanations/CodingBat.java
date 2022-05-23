package testing_or_explanations;

import java.util.*;

public class CodingBat {
    public  static String wordAppend(String[] strings) {
        String result="";

        ArrayList<String> list=new ArrayList<>(Arrays.asList(strings));

        Map<String,Integer> map=new HashMap<>();

        for(String each:strings){
            if(Collections.frequency(list, each)>=2){
                map.put(each,Collections.frequency(list, each)/2);}
        }

        for(Integer each: map.values()){
            for(String eachKey: map.keySet()){
                for(int i=0; i<each;i++){
                    result+=eachKey;
                }
            }
        }

        return result;
    }



    public static void main(String[] args) {

        wordAppend(new String[]{"a", "b", "b", "b", "a", "c", "a", "a"});
    }
}

