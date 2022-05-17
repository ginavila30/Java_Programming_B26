package day06_05_16_2022;
/*  Task 01 ;      Write a program that determines if the given sentence contains the given word (Do not use contains() method)

                   Ex;
                   Input: String sentence = "Java is the best programming language"
                          String word = "Java";
                   Output: true
*/
public class StringContainsWithNoMethod {
    public static boolean contains(String sentence, String word){
        int num=word.length();
        for (int i = 0; i < sentence.length()-(num-1) ; i++) {
            if(sentence.substring(i,i+num).equals(word)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(contains("Java is the best programming language", "Java"));
    }


}
