package testing_or_explanations.CodingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Compare2ArrayList {
    public static boolean compare2List(ArrayList<String> list, ArrayList<String> list2) {
        boolean same = false;
        Collections.sort(list);
        Collections.sort(list2);
        if (list.size() == list2.size()) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == list2.get(i)) {
                    same = true;
                } else {
                    same = false;
                    break;

                }
            }
        }
        return same;

    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("hello", "bye", "java1#"));
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("hello","bye","vaja1!"));

        System.out.println(compare2List(list, list2));
    }


}
