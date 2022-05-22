package day61_maps;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    /*
    Rank
    1     -Student
    2     -Student
    3     -Student
    4     -Student
    5     -Student

     */

    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        map.put(1, new Student("James", 4.0, 7));
        Student obj = new Student("Hanna", 3.9, 10);
        map.put(2, obj);
        map.put(3, new Student("Diana", 3.8, 14));
        map.put(4,new Student("Jehad",3.7,29));

        System.out.println(map);

        System.out.println(map.get(5));//get null because I do not have a key 5 in my map
        System.out.println(map.get(1));// get entry(value) paired with key 1
        System.out.println(map.get(4).name);//accessing instance variables of my object value.'

        System.out.println(map.keySet());// printing keyset -> set of my map keys

        //looping through a map
        //keyset()
        for (Integer keys: map.keySet()){
            System.out.println("Rank: "+keys);
            System.out.println(map.get(keys));
            System.out.println();
        }
        //map.values()
        for (Student student:map.values()) {
            if(student.id<=10){
                System.out.println(student);
            }
        }
        //entrySet()
        for (Map.Entry<Integer,Student> entry :map.entrySet()){
            System.out.println("Rank: "+entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
        }
    }

}
