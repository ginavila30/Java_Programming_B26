package day62_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/*Given an ArrayList of names, remove all the names that are 'Ahmed'

    - Think about how many different ways you can do this*/
public class RemoveAhmedNames {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ahmed","gina","majid","lore","ahmed","ana"));

        //Option1
        Iterator<String> it =list.iterator();

        while (it.hasNext()){
            if(it.next().equalsIgnoreCase("ahmed")){it.remove();}
        }
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("ahmed","gina","majid","lore","ahmed","ana"));
        //option2
        list2.removeIf(each-> each.equalsIgnoreCase("ahmed"));
        System.out.println(list2);

        //option3
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("ahmed","gina","majid","lore","ahmed","ana"));
        ArrayList<String> list4=new ArrayList<>();
        for (String each:list3) {
            if(!each.equalsIgnoreCase("ahmed")){
                list4.add(each);
            }
        }

    }
}
