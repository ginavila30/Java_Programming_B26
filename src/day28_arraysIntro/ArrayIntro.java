package day28_arraysIntro;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        // With normal Vxs

        String city1="Chicago";
        String city2="New York";
        String city3="Houston";
        String city4="Denver";
        String city5="Pittsburgh";

        // Declare Array with values:

        String[]cities={"Chicago","New York", "Houston", "Denver", "Pittsburgh"};

        System.out.println(cities[0]); // Chicago
        System.out.println(cities[1]);// New York
        System.out.println(cities[2]);//Houston
        System.out.println(cities[3]);//Denver
        System.out.println(cities[4]);//Pittsburgh

        // Print all elements in one line.

        System.out.println("Reverse order of cities:"+cities[4]+""+cities[3]+""+cities[2]+""+cities[1]+""+cities[0]); // concatenate

        // How to print array all at one time.
        System.out.println(cities);// this does not print array as we want.
        System.out.println(Arrays.toString(cities));// I need to import Arrays class from java.util.Then use .ToString() method. Inside parenthesis enter the array name that you need to print.

        // number of elements
        System.out.println(cities.length);
    }
}
