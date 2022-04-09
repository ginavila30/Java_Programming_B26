package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("apples","tree","loop","cat","animal","shortcut"));

        ArrayList<String>result=new ArrayList<>();
        for (String each:list){
            if(each.length()<=4){
                result.add(each);
            }
        }
        System.out.println(result);
    }
}
