package day07_unaryoperators;

import jdk.swing.interop.SwingInterOpUtils;

public class Letters {
    public static void main(String[] args) {
       /* char let1='G';
        System.out.println(let1);
        let1++;
        System.out.println(let1);
        let1++;
        System.out.println(let1);
       let1++;
        System.out.println(let1);
        let1++;
        System.out.println(let1);*/

        // Other Approach
        char let2='S';

        System.out.println(let2++); // first time the post increment will be the original value.
        System.out.println(let2);// I am running the variable only to see the increment that the previous statement applied.
        System.out.println(let2++);// from the second time I run it I see already the increment
        System.out.println(let2++);



    }
}
