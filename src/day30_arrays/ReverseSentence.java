package day30_arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "Today is monday";
        String[]wordsInSentence=sentence.split(" ");
        String reversed="";
        for (int i = wordsInSentence.length-1; i>=0;i--){
            reversed+=wordsInSentence[i]+" ";
        }
        System.out.println(reversed);
    }
}
