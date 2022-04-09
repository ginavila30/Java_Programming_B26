package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class keepLongString {
    public static ArrayList<String> keepLongString(ArrayList<String>list, int num){

//        Long approach
//        for (int i=0; i< list.size();i++) {
//
//            if(list.get(i).length()<num){
//                list.remove(i);
//                i--;
//            }
//        }
        list.removeIf(each->each.length()<num);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("one", "two", "three","one", "four", "five", "six"));
        System.out.println(keepLongString(list, 4));
    }
}

