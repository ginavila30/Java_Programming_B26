package testing_or_explanations.dardanTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SortNumbersAndLetters {
    /*String - Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together. Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"*/
    public static void main(String[] args) {
        String str = "DC501GCCCA098911";
        ArrayList<String> list = new ArrayList<>();
        String resultLetters = "";
        String resultNums = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (resultNums.length() > 0) {
                    list.add(resultNums);
                    resultNums = "";
                }
                resultLetters += str.charAt(i);
            } else if (Character.isDigit(str.charAt(i))) {
                if (resultLetters.length() > 0) {
                    list.add(resultLetters);
                    resultLetters = "";
                }
                resultNums += str.charAt(i);
            }
        }
        if (!resultLetters.isEmpty()) {
            list.add(resultLetters);
        } else if (!resultNums.isEmpty()) {
            list.add(resultNums);
        }

        System.out.println(list);
        String appendedStr = "";
        for (String each : list) {
            String []arr = each.split("");
            Arrays.sort(arr);
            for (String each2:arr) {
                appendedStr+=each2;
            }
        }
        System.out.println(appendedStr);
    }
}
