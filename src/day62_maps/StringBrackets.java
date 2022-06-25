package day62_maps;

import java.util.HashMap;
import java.util.Map;

/**
 * [IQ] Create a method that will accept a String of brackets. Determine if the brackets are balanced. Brackets are balanced if the closing bracket matches the opening one.
 * <p>
 * https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues
 * <p>
 * Ex: {([])} -> balanced
 * {[(])} -> not balanced
 * <p>
 * Hint: Maps and Stacks are helpful to solve
 */
public class StringBrackets {
    public static void main(String[] args) {
new Object();
        System.out.println(isBalanced("{{[()]}}"));
    }

    public static boolean isBalanced(String str) {
        Map<Character, Character> map = new HashMap<>();
        if (str.length() % 2 == 0) {
            for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++) {
                map.put(str.charAt(i), str.charAt(j--));
            }
            boolean balanced = false;
            for (Map.Entry<Character, Character> each : map.entrySet()) {
                switch (each.getKey()) {
                    case '{':
                        if (each.getValue().equals('}')) {
                            balanced = true;
                        } else {
                            balanced = false;
                        }
                        break;
                    case '(':
                        if (each.getValue().equals(')')) {
                            balanced = true;
                        } else {
                            balanced = false;
                        }
                        break;
                    case '[':
                        if (each.getValue().equals(']')) {
                            balanced = true;
                        } else {
                            balanced = false;
                        }
                        break;
                }
            }
            return balanced;

        } else {
            return false;
        }


//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < str.length(); i++) {
//            if (!map.containsKey(str.charAt(i))) {
//                map.put(str.charAt(i), 1);
//            } else {
//                map.put(str.charAt(i), map.get(str.charAt(i) + 1));
//            }
//        }
//        System.out.println(map);
//        boolean balanced = true;
//
//        for (Integer each : map.values()) {
//            for (Integer each2 : map.values()) {
//                if (!each.equals(each2)) {
//                    balanced = false;
//                    break;
//                }
//            }
//        }
//        return balanced;
    }


}
