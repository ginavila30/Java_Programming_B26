package day31_arrays;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {
        int[]a={1,2,3};
        int[]b={1,2,3};
        Arrays.equals(a,b);
        // System.out.println(a==b);This is only to check memory position.
        //System.out.println(a.equals(b)); We should not use this one.Because it is not calling the Arrays method.And it uses a future topic we hav ent covered yet.

    }
}
