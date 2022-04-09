package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TargetWord {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("java","html","css","java","javascript","selenium"));
        Scanner scan=new Scanner(System.in);
        System.out.println("What word do you want to check?");
        String targetWord= scan.nextLine();
        int count=0;

       if(list.contains(targetWord)){
        for (String each:list) {
            if(each.equals(targetWord)){
                count++;
            }
        }
        System.out.println(targetWord+" is "+count+" times in the Array list");}else {
           System.out.println(targetWord+" is not in te array list");
       }
    }
}
