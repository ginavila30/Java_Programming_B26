package testing_or_explanations.dardanTasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindUnique {
    /*String -- Find the unique
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static String uniquechars(String str){
       String result="";
       //counter approach
//        for (int i = 0; i <str.length() ; i++) {
//            int count =0;
//            for (int j = 0; j <str.length() ; j++) {
//                if(str.charAt(i)==str.charAt(j)){
//                    count++;
//                }
//            }
//            if(count==1){result+=str.charAt(i);}
//        }

        //map approach
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else {map.put(str.charAt(i), map.get(str.charAt(i))+1);}
        }
        for (Character each: map.keySet()) {
            if(map.get(each)==1){
                result+=each;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(uniquechars("AAABBBCCCDEF"));
    }
}
