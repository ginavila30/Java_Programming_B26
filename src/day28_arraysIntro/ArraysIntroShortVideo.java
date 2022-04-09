package day28_arraysIntro;


import java.util.Arrays;

public class ArraysIntroShortVideo {
    public static void main(String[] args) {
        int[]numbers= new int[5]; // [0,0,0,0,0]

        System.out.println("numbers = " + numbers);// This does not print my variable values because first I need to pass it to String.
        System.out.println(Arrays.toString(numbers)); // To print the values I import java util arrays, and the use the method: Arrays.toString(); within parenthesis I enter the array variable name.

        numbers[0]=10; // I am assigning value 10 to the index 0 of my array.
        numbers[1]=20; //I am assigning value 120 to the index 1 of my array.
        numbers[2]=30; //I am assigning value 120 to the index 1 of my array.
        numbers[3]=40; //I am assigning value 120 to the index 1 of my array.
        numbers[4]=50; //I am assigning value 120 to the index 1 of my array.
        //numbers[5]=60;  This gives me error because I specify the size of the array 5 which means length is 5 and index will go u to 4.

        System.out.println(Arrays.toString(numbers)); // To print the values I import java util arrays, and the use the method: Arrays.toString(); within parenthesis I enter the array variable name. Here the array reflects the values I already assigned.

        String[]colors={"Yellow", "Red","White","Blue","Green","Black"}; // I initialize the variable in one statement because I already know the values I need to store. The size of this array is 6 it can not be increased or decreased.

        System.out.println(colors.length);// I can use method .length to know the size of the array.
        System.out.println(Arrays.toString(colors));
    }
}
