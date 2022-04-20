package testing_or_explanations.CodingPractice;

import java.util.Arrays;

public class Merge2arrayString {
    public static void main(String[] args) {
        String[] str1 = {"mo", "da", "sis", "bro"};
        String[] str2 = {"m", "d","ter","ther","kid"};
        String[] shortest;
        String[] longest;

        if (str1.length <= str2.length) {
            shortest = Arrays.copyOf(str1, str1.length);
            longest = Arrays.copyOf(str2, str2.length);
        } else {
            shortest = Arrays.copyOf(str2, str2.length);
            longest = Arrays.copyOf(str1, str1.length);
        }

        for (int i = 0; i < shortest.length; i++) {
            longest[i] = str1[i] + str2[i];
        }

        System.out.println(Arrays.toString(longest));

    }
}
