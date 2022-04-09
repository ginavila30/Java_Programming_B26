package day38_arraylist;

import java.util.ArrayList;

public class ClassroomTwo {
    public static void main(String[] args) {
        ArrayList<String>group=new ArrayList<>();
        group.add("Ziba");
        System.out.println(group);
        group.add(0,"Victor");
        System.out.println(group);
        System.out.println(group.get(0));
        System.out.println(group.get(1));
        group.add("Ozi");// by default .add adds element to the end.
        System.out.println(group);
        group.add(1,"James");
        System.out.println(group);
       // group.add(5,"Gina");index 5 does not exist it is not valid. So this is error. I can only add to the end or to an existing index.




    }
}
