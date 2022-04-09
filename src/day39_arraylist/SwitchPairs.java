package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SwitchPairs {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList());
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the words, when done type in exit");

        do{list.add(scan.nextLine());}while(!list.contains("exit"));

        list.remove("exit");

        if (list.size() % 2 == 0) {
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 != 0) {
                    list.add(i - 1, list.remove(i));// the remove deletes the word and also returns the one I am trying to assign.
                }
            }
            System.out.println(list);
        } else {
            System.out.println("Array list size must be even");
        }
    }
}
