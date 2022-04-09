package day16_04_06_2022;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSmallTask {
    public static void main(String[] args) {
        System.out.println("===============Small Task1===================");

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list.set(list.size()-1,0);
        System.out.println(list);

        System.out.println("==========Small Task2========");

        Collections.swap(list,0,list.size()-1);
        System.out.println(list);

        System.out.println("==========Small Task3===========");

        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(1,2,3,4,5));

        for (int i=0;i< list2.size();i++) {

            if(list2.get(i)%2!=0){
                list2.set(i,list2.get(i)*2);
            }
        }
        System.out.println(list2);

        System.out.println("===============Small Task 4===================");

        String[]letters1={"A", "B", "C"};
        String[]letters2={"D", "E", "F", "G"};
        ArrayList<String>combine=new ArrayList<>();
        combine.addAll(Arrays.asList(letters1));
        combine.addAll(Arrays.asList(letters2));
        System.out.println(combine);

    }
}
