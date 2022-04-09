package day23_loops;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str= scan.nextLine().toLowerCase();
        int count=0;
        for (int i=0;i<str.length();i++) {

           if(str.charAt(i)=='h'&& str.charAt(i+1)=='i'){count++;}        }

        System.out.println(""+str+" has "+count+" hi.");
    }
}
