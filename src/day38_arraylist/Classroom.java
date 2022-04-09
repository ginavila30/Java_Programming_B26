package day38_arraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<String> group=new ArrayList<>();
        System.out.println(group.size());// Return numbers of elements
        // add method
        group.add("Selo");
        group.add("Alex");
        group.add("Eda");
        group.add("Nav");
        group.add("Neli");
        System.out.println(group);
        System.out.println(group.size());
        System.out.println("First Student: "+group.get(0));
        System.out.println("Second Student: "+group.get(1));
        System.out.println("Third Student: "+group.get(2));
        System.out.println("Four Student: "+group.get(3));
        System.out.println("Fifth Student: "+group.get(4));
        System.out.println();
        // loop to avoid above repetition
        for (int i = 0; i < group.size() ; i++) {
            System.out.println("Student "+(i+1)+" "+group.get(i));
        }
        //Example of using for each loop
        for (String each:group) { // each does what group.get() did in the traditional loop above.
            System.out.println("Student "+each);

        }

     }
}
