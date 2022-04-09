package day07_unaryoperators;

import jdk.swing.interop.SwingInterOpUtils;

public class IncrementExample3 {
    public static void main(String[] args) {

        int i=5;
        int z=i++;

        System.out.println(i);// 5 first but then 6 because i was increased in  the line below.
        System.out.println(z);// 5

        int a=10;
        int b=a+1;

        System.out.println(a);
        System.out.println(b);

        int c=++a; //a=10 -> a is incremented by 1. So C values is a incremented by 1.
        System.out.println(c);
        System.out.println(a); // a now is 11 because in line 18 it was incremented by 1.

        int A=20;
        int C=A++; // C is not increasing, C is being assigned A. But A is being increased so A will turn in to 21 after this.

        System.out.println(A);// A=21
        System.out.println(C);//C=20 and will be that value all the time because it is not being increased.
        System.out.println(A++);// A=21 because it is the first time I am printing it.
        System.out.println(A++);// A=22 now it starts showing me the incremental.
        System.out.println(A++); //A=23
        System.out.println(C++);// Now I am printing post increment for C, First time it will show the original value -> C=20
        System.out.println(C++);// now it will start showing the increment. C=21











    }
}
