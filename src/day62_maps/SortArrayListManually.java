package day62_maps;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

/*Sort an array or ArrayList yourself. Not using provided sort methods.
I will share solution of this soon*/
public class SortArrayListManually {
 public static List sortArray(ArrayList< Integer> list){

     for (int i = 0; i <list.size() ; i++) {
         for (int j = i; j < list.size() ; j++) {
             if(!(list.get(i) < list.get(j))){
                 Integer temp = list.get(i);
                 list.add(i, list.get(j));
                 list.remove(i+1);
                 list.add(j,temp);
                 list.remove(j+1);
             }
         }
     }
     return list;
 }

    public static void main(String[] args) {
        System.out.println(sortArray(new ArrayList<Integer>(Arrays.asList(5,12,9,3,7,52))));

    }
}
