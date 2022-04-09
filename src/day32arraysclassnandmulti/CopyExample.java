package day32arraysclassnandmulti;

import java.util.Arrays;

public class CopyExample {
    public static void main(String[] args) {
        int[]a={1,2,3};
        int[]b=a;// b is a new reference / name but the array is the same as a reference is pointing to. So there is only one array made.
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        // below I will change values, but it does not matter where I change it b or a array because they are both one same array.
        a[0]=100;
        b[1]=200;
        System.out.println

                (Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        // copying an array properly so that they are not pointing the same.
        int[]z=Arrays.copyOf(a,a.length);// In the argument first the array name that I want to copy, after coma, the size.
        System.out.println(Arrays.toString(z));
        z[0]=500;// changing element on index 0. Now because I created a new array pointing to a different value, the element changes in z but not in b or a.
        System.out.println(Arrays.toString(z));
    }
}
