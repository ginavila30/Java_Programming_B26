package day19_stringmethods2;

public class IndexOfMethod2 {
    public static void main(String[] args) {
        String s="java";
        System.out.println(s.indexOf('a'));// will return 1 because it finds the first occurrence.
        System.out.println(s.lastIndexOf('a'));// returns 3
        String s2="abcbcb";
        System.out.println(s2.indexOf('b'));// returns 1
        System.out.println(s2.lastIndexOf('b'));//5
        System.out.println(s2.indexOf("cb"));//2
        System.out.println(s2.lastIndexOf("cb"));//4
        System.out.println(s.indexOf("cbd"));//-1


    }
}
