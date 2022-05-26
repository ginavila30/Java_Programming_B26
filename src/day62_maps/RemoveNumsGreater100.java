package day62_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*Given an ArrayList of numbers, remove all the numbers more than 100

    - Think about how many different ways you can do this*/
public class RemoveNumsGreater100 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(100,50,200,60,300,70));
        Iterator<Integer>it= list.iterator();
        while (it.hasNext()){
            if(it.next()>100){
                it.remove();
            }
        }
        System.out.println(list);

        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(100,50,200,60,300,70));
        list2.removeIf(each->each>100);
        System.out.println(list2);

        ArrayList<Integer>list3=new ArrayList<>(Arrays.asList(100,50,200,60,300,70));
        ArrayList<Integer>list4=new ArrayList<>();

        for (Integer each:list3) {
            if(each<=100){
                list4.add(each);
            }
        }
        System.out.println(list4);

    }
}
