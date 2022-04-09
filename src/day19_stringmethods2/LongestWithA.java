package day19_stringmethods2;

import java.util.Locale;
import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words:");
        String wordOne = input.next().toLowerCase();  // apple
        String wordTwo = input.next().toLowerCase(); // java
        String wordThree = input.next().toLowerCase();

        String longestWord = "";

        if (wordOne.contains("a") && wordOne.length() > longestWord.length()) {
            longestWord = wordOne;
        }

        if (wordTwo.contains("a") && wordTwo.length() > longestWord.length()) {
            longestWord = wordTwo;
        }

        if (wordThree.contains("a") && wordThree.length() > longestWord.length()) {
            longestWord = wordThree;
        }

        System.out.println(longestWord.isEmpty() ? "No single largest word with a" : longestWord + " is the longest word with a");
    }
}
