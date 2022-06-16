package testing_or_explanations.dardanTasks;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*Tasks for next week

ArrayList -- Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed

ArrayList -- Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

ArrayList -- sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method

ArrayList -- sorting in descending order
Write a method that can sort the ArrayList in descending order without using the sort method*/
public class ArrayListPractices {
    public static void main(String[] args) {
        //Remove Ahmed
        ArrayList<String>names = new ArrayList<>(Arrays.asList("Ahmed", "John","Eric","Ahmed"));
        Iterator it =names.iterator();
        while(it.hasNext()){
            if(it.next().equals("Ahmed")){
                it.remove();
            }
        }
        System.out.println(names);

        //Remove nums >100
        ArrayList<Integer>nums = new ArrayList<>(Arrays.asList(1,5,18,200,98,520));
        nums.removeIf(each->each>100);
        System.out.println(nums);

        //Sort Array Ascending
        ArrayList<Integer>nums2 = new ArrayList<>(Arrays.asList(10,5,300,200,98,520));
        for (int i = 0; i <nums2.size() ; i++) {
            for (int j = 0; j <nums2.size() ; j++) {
                if(nums2.get(i)<nums2.get(j)){ //nums2.get(j)>nums2.get(i)
                   int temp= nums2.get(i);
                    nums2.set(i,nums2.get(j));
                    //nums2.remove(i+1);
                    nums2.set(j,temp);
                   // nums2.remove(j+1);
                }
            }
        }
        System.out.println("Ascending->"+nums2);

        //Sort Array Descending
        for (int i = 0; i <nums2.size() ; i++) {
            for (int j = 0; j <nums2.size() ; j++) {
                if(nums2.get(i)>nums2.get(j)){
                    int temp= nums2.get(i);
                    nums2.set(i,nums2.get(j));
                    //nums2.remove(i+1);
                    nums2.set(j,temp);
                    //nums2.remove(j+1);
                }
            }
        }
        System.out.println("Descending->"+nums2);

    }
}
