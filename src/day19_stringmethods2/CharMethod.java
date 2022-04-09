package day19_stringmethods2;

public class CharMethod {
    public static void main(String[] args) {
        String s="java";
        //        0123 Index
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        //System.out.println(s.charAt(4)); this will show error in the console, string index out of bounds.Because there is not 4 index in the variable s.

        int lastIndex= s.length()-1;
        System.out.println("last char: "+s.charAt(lastIndex)); // this is same as line 11 but dynamic version.
        int secondLastIndex= s.length()-2;
        System.out.println("Second last char: "+s.charAt(secondLastIndex)); // this is same as line 10 but dynamic version.
    }
}
