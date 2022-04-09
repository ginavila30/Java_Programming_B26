package testing_or_explanations;

import java.util.ArrayList;

public class Interview {
    public static void main(String[] args) {
        String[]arr={"java","apple","code","java"};
        ArrayList<Integer>list=new ArrayList<>();
        for (String each:arr) {
            int count=0;
            for (String each2:arr){

                if (each.equals(each2)){count++;}
            }
            list.add(count);
        }
        System.out.println(list);
    }

}
