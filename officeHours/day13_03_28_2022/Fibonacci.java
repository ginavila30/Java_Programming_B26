package day13_03_28_2022;

import java.util.ArrayList;

public class Fibonacci {
    public static String fibonacci(int x) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0, 0);
        result.add(1, 1);
        String str="0, 1, ";
        for (int i = 1, j = 2; i < x; i++, j++) {
            result.add(j, result.get(j - 1) + result.get(j - 2));
            str+=result.get(j)+", ";
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
