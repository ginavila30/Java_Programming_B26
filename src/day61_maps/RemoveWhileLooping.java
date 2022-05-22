package day61_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(2,5,6,12,6,35,6,2,5,6,2,3,1));
//        for (int i = 0; i < list.size() ; i++) {
//            if(list.get(i)<5){
//                list.remove(i);// skips some numbers so it is not good approach
//            }
//        }
//        System.out.println(list);
//        for (int each:list){
//            if(each<5){
//                list.remove(each);// throws exception because for each loop is only for reading not to change them.
//            }
//        }

        Iterator<Integer>it=list.iterator();

        while(it.hasNext()){// checks if there is an element next to it
            if(it.next()<5){//move to next element and returns it
                it.remove();// remove the element from the list
            }
        }
    }

}
