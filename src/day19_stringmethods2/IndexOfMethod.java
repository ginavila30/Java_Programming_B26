package day19_stringmethods2;

public class IndexOfMethod {
    public static void main(String[] args) {
        String s="pen";
        System.out.println(s.indexOf("p"));
        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf("n"));
        System.out.println(s.indexOf("x"));// if the character is not part of the string I will always get -1
        System.out.println(s.indexOf("pe"));// if i ask multiple characters, It returns the index value of the first character.
        System.out.println(s.indexOf("pz"));// This returns -1 because that sequence of characters is not part of the String.

    }
}
