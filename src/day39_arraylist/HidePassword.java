package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("one","hi","hold"));

        for (int j=0; j< list.size(); j++) {
            String each=list.get(j);

            for (int i = 0; i <each.length() ; i++) {
                each=each.replace(each.charAt(i),'*');
            }
            list.set(j,each);
        }
        System.out.println(list);

    }
}
