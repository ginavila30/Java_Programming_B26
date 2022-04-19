package day48_encapsulation.static_imports;

import my_utilities.StringUtil;

import java.util.Arrays;

public class Normal {
    public static void main(String[] args) {
        int[]a={4,12,5,25};
        Arrays.sort(a);// static method calling it from Arrays class
        System.out.println(Arrays.toString(a));// static  method calling it from Arrays class
        System.out.println(Math.PI);// Static variable calling from Math class
        System.out.println(StringUtil.reverseString("java"));//static  method calling it from Arrays class
    }
}
