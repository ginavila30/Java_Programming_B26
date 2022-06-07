package day30_06_07_2022;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "aaabbc";
        String result="";
        List<String> list= Arrays.asList(str.split(""));
        for (String each:new LinkedHashSet<>(list)) {
            result+=each+ Collections.frequency(list,each);
        }
        System.out.println(result);
    }


}
