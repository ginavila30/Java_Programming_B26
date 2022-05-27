package testing_or_explanations.dardanTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramMultidimensionalArrayList {
    public static ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {//strs = ["eat","tea","tan","ate","nat","bat"]

        ArrayList<ArrayList<String>> result = new ArrayList<>();

        for (String each : strs) {
            ArrayList<String> anagramWords = new ArrayList<>();
            String[] arr = each.split("");
            Arrays.sort(arr);
            for (String each2 : strs) {
                String[] arr2 = each2.split("");
                Arrays.sort(arr2);
                if (Arrays.equals(arr, arr2)) {
                    anagramWords.add(each2);
                }

            }
            if (!result.contains(anagramWords)) {
                result.add(anagramWords);
            }


        }
        return result;
    }

        public static void main (String[]args){
            System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        }
    }
