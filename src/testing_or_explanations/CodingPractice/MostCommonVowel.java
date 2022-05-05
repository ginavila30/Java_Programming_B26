package testing_or_explanations.CodingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MostCommonVowel {
    public static String mostCommonVowel(String s) {
        s = s.toLowerCase();
        String[] arr = s.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        int a = Collections.frequency(list, "a");
        int e = Collections.frequency(list, "e");
        int i = Collections.frequency(list, "i");
        int o = Collections.frequency(list, "o");
        int u = Collections.frequency(list, "u");
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(a, e, i, o, u));
        int max = Collections.max(list2);
        String result = "";
        if (a == max) {
            result += "a appears " + a + " times\n";
        }
        if (e == max) {
            result += "e appears " + e + " times\n";
        }
        if (i == max) {
            result += "i appears " + i + " times\n";
        }
        if (o == max) {
            result += "o appears " + o + " times\n";
        }
        if (u == max) {
            result += "u appears " + u + " times\n";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(mostCommonVowel("e should be the most common vowel in this sentence"));
    }
}
