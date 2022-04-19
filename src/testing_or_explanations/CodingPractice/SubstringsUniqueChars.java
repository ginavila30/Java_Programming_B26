package testing_or_explanations.CodingPractice;

import java.util.ArrayList;

/*
Count of substrings having all distinct characters
Given a string str consisting of lowercase alphabets, the task is to find the number of possible substrings (not necessarily distinct) that consists of distinct characters only.
Examples:
Input: Str = “gffg”
Output: 6
Explanation:
All possible substrings from the given string are,
( “g“, “gf“, “gff”, “gffg”, “f“, “ff”, “ffg”, “f“, “fg“, “g” )
Among them, the highlighted ones ( “g“, “gf“, “f“, “f“, “fg“, “g” ) consists of distinct characters only.
Input: str = “gfg”
Output: 5
Explanation:
All possible substrings from the given string are,
( “g“, “gf“, “gfg”, “f“, “fg“, “g” )
Among them, the highlighted ( “g“, “gf“, “f“, “fg“, “g” ) consists of distinct characters only.
 */
public class SubstringsUniqueChars {
    public static void main(String[] args) {
        String str = "gfg";
        ArrayList<String> subStrings = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                subStrings.add(str.substring(i, j + 1));
            }
        }
        ArrayList<String> uniques = new ArrayList<>();
        for (String each : subStrings) {
            String repeated = "";
            boolean unique= true;
            for (int i = 0; i < each.length(); i++) {
                if (!repeated.contains("" + each.charAt(i))) {
                    repeated += each.charAt(i);
                } else { unique=false;
                    break;
                }
            }
            if(unique){uniques.add(each);}

        }
        System.out.println(uniques.size());
    }
}
