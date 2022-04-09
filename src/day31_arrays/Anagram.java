package day31_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter te two inputs");
        String input1= scan.nextLine();// listen
        String input2= scan.nextLine();// silent

       char[]arr1 =input1.toCharArray();//{l,i,s,t,e,n}
        char[]arr2 =input1.toCharArray();//{s,i,l,e,n,t}
        Arrays.sort(arr1);// sort 1st array
        Arrays.sort(arr2);//sort second array
        System.out.println(Arrays.equals(arr1,arr2)?"Anagram":"Not anagram"); // compare both arrays. If they are exact same after sorting, they are anagram otherwise not.

    }
}
