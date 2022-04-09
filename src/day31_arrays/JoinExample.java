package day31_arrays;

import java.util.Arrays;

public class JoinExample {
    public static void main(String[] args) {
        String[]words={"a","b","c"};
        System.out.println(Arrays.toString(words)); // Prints with the []
        System.out.println(String.join("<>",words));// takes the element of my array(words in this case), and separates them wit the delimiter that i decide(in this case<>)---> result will be a<>b<>c

    }


}
