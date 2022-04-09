package day30_arrays;

import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {
         String str ="It started to snow in Chicago";
         String []arr=str.split(" ");
         String result="";


        for (String each : arr) {
            String backWord="";

            for (int i = each.length()-1, j=0 ; i >=0 ; i--,j++) {

                backWord+=each.charAt(i);
            }
            result+=backWord+" ";

    }
        System.out.println(result);
}}
