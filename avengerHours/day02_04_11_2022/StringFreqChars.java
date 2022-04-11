package day02_04_11_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//"AABCCDDEE"
public class StringFreqChars {
    public static String stringFreqChars(String str) {
        String[] arr = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        ArrayList<String> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            int freq = Collections.frequency(list, list.get(i));
            newList.add(list.get(i) + freq);

        }
        String result = "";
        for (String each : newList) {
            if (result.contains(each)) {
                continue;
            } else {
                result += each;
            }


        }return result;}

    public static void main(String[] args) {
        System.out.println(stringFreqChars("AABCCDDEE"));
    }
}
