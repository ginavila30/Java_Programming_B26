package day18_stringMethods;

public class StartsWith_EndsWith {
    public static void main(String[] args) {
        String str="Apples";
        System.out.println(str.startsWith("App"));// true
        System.out.println(str.startsWith("app"));// false
        System.out.println(str.startsWith("Apples"));// true

        String s="A";
        System.out.println(str.startsWith(s));//true

        String sentence="today was a good day";
        System.out.println(sentence.endsWith("day"));// true
        System.out.println(sentence.endsWith(" day"));// true it counts the space.
        System.out.println(sentence.endsWith("good"));//false
        System.out.println(sentence.endsWith(("today was a good day")));
    }
}
