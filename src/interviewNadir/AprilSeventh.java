package interviewNadir;

import java.util.ArrayList;
import java.util.Arrays;

public class AprilSeventh {
    /*method
    * parameter ArrayList string
    * trim every single element
    * return trimmed
    * */
    public static ArrayList<String> trimArrayList(ArrayList<String>list){

       if(!list.isEmpty() && list!=null){
        for (int i=0; i<list.size();i++) {
            list.set(i, list.get(i).trim());
        }}
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("  apple","  job","java"));

        System.out.println(trimArrayList(list));
    }
}
