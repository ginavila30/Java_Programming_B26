package testing_or_explanations.TopicReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class InterviewHelp {
    public static void main(String[] args) {
        String s ="Hi Hello How are you welcome to USA Thanks Welcome to USA USA";
        List<String>list= new ArrayList<>(Arrays.asList(s.trim().split(" ")));
        HashMap<Integer,String> map = new HashMap<>();
        for (int i = 0; i <list.size() ; i++) {
            map.put(i+1, list.get(i));
        }
        System.out.println(map);
    }
}
