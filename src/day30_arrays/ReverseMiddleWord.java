package day30_arrays;

public class ReverseMiddleWord {
    public static void main(String[] args) {
        String sentence ="Java always fun";
        String[]wordsInSentence= sentence.split(" ");
        String reversed="";
        char[] middleWord = wordsInSentence[1].toCharArray();// extract middle word and converted it in to char array

        for (int i = middleWord.length-1; i>=0 ; i--) {
           reversed+=middleWord[i]; // going backwards each char in the middle word array.
        }
        System.out.println(wordsInSentence[0]+" "+reversed+" "+wordsInSentence[2]);
    }
}
