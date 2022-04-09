package day18_stringMethods;

public class CompareTo {
    public static void main(String[] args) {
        String st1="java";
        String st2="Python";
        System.out.println(st1.compareTo(st2)); // Result is a positive #. Here string 2 comes first because when comparing index by index P ascii value is 74 while j ascii value is 106. So P is higher.

        st1="java";
        st2="java";
        System.out.println(st1.compareTo(st2)); // Result is 0. The 2 stings are identical.

        st1="Gina";
        st2="Avila";
        System.out.println(st2.compareTo(st1)); // Result is negative #. Because A is first in ascii table than G.

    }
}
