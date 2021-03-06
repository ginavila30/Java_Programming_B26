package day02_print_statements.day09_03_15_2022;

import java.util.Arrays;

public class ArraysIntro {public static void main(String[] args) {

        /*
        What is an array ?

        An array is data structure that can hol multiple values

        ordered data structure (has index numbers)

        Size is fixed (Disadvantage)


        Default Values

        String -- > null
        byte - short -int -long --> 0
        float - double --> 0.0
        boolean --> false


         */

    // declaring arrays

    //1

    String[] colors={"Yellow","Blue","Pink"};

    // colors[3]="Purple";  --> We cant add element after init

    // 2

    int[] numbers=new int[3];
    System.out.println(Arrays.toString(numbers));
    numbers[0]=1;
    numbers[1]=1;
    numbers[2]=1;

    // how can we retrieve data from array
    System.out.println(colors[0]);  // Yellow

    // how can we reassign data from array
    colors[0]="Red";
    System.out.println(colors[0]);  // Red

        /*
        Arrays Utility

            Arrays class is peresented "java.util"
            - toString()
         */

    System.out.println(Arrays.toString(colors));
    System.out.println(Arrays.toString(colors).replace("[", "").replace("]", "").toLowerCase().trim());

    // length

    System.out.println(colors.length);

    // What is difference between length() VS length ?

    // length --> This is for arrays.This is property
    // length() -> This is for Strings.This is method


    // get me last element of colors
    System.out.println(colors[colors.length - 1]);


}
}
