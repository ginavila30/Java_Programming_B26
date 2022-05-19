package day60_collections;

import com.sun.security.jgss.GSSUtil;

import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {
        Stack<Character> stack1= new Stack<>();

        stack1.push('a');//push method is same as adding
        stack1.push('b');
        stack1.push('c');
        stack1.push('d');
        stack1.add('e');
        System.out.println(stack1);
        System.out.println(stack1.peek()+" Element at the top (last in)");
        stack1.pop();//removes element at the top of teh stack. but also returns what element was removed.
        System.out.println(stack1);
        System.out.println(stack1.pop());//removes element at the top of teh stack. but also returns what element was removed.
        System.out.println(stack1.remove(0));// removes based on index
        System.out.println(stack1);

    }
}
