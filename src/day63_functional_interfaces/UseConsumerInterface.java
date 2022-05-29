package day63_functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UseConsumerInterface {

    public static Consumer<String> printNameInCaps = (str) -> {
        System.out.println(str.toUpperCase());
    };


    public static void main(String[] args) {
        Consumer<Integer> printTon = (n) -> {
            for (int i = 0; i <= n; i++) {
                System.out.println(i + " ");
            }
        };

        printTon.accept(50);
        System.out.println();

        List<String> list = new ArrayList<>(Arrays.asList("hello", "summer", "pool", "warm"));

        list.forEach(e -> System.out.println(e));//example of lambda with no parenthesis and no {} because it is only one line for each
        list.forEach(e -> System.out.println(e.charAt(0) + " " + e.charAt(e.length() - 1)));//example of lambda with no parenthesis and no {} because it is only one line for each
        list.forEach(word -> {
            if (word.length() < 5) {
                System.out.println(word);
            }
        });

    }

}
