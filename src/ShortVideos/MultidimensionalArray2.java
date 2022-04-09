package ShortVideos;

import java.util.Arrays;

public class MultidimensionalArray2 {
    public static void main(String[] args) {

        /*
        Group 1={"Ahmed", "Jimmy"};
        Group 2={"Breanna","Victoria","Daniel"};
        Group 3 ={"Natalia","Aaron","Christina","Josh"};
        */

        String [][]groups={{"Ahmed", "Jimmy"},{"Breanna","Victoria","Daniel"},{"Natalia","Aaron","Christina","Josh"}};

        System.out.println(Arrays.toString(groups[1])); // Printing 1 array from the multidimensional array group.
        System.out.println(groups[2][0]); // Retrieving array index 3 element index 0.
        System.out.println(Arrays.deepToString(groups));// printing entire multidimensional array.

    }
}
