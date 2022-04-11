package day02_04_11_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//"AABCCDDEE"
public class StringFreqChars {
    public static String stringFreqChars(String str) {
        String[] arr = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (!result.contains(list.get(i))) {
                int freq = Collections.frequency(list, list.get(i));
                result+= list.get(i);
                result+=freq;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(stringFreqChars("AABCCDDEE"));
    }
}
