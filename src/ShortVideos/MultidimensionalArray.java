package ShortVideos;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int []arr1 = {10,20,30};
        int []arr2 = {40,50};
        int []arr3 = {60,70};

//        int [][] multiArray= new int[3][];// This is how I declare rge array when I don't know the values that I need to store. #3 indicates how many arrays I will include.
//        multiArray[0]=arr1; // Assigning value(one whole array) to index 0 of multi array
//        multiArray[1]=arr2;// Assigning value(one whole array) to index 1 of multi array
//        multiArray[2]=arr3;// Assigning value(one whole array) to index 2 of multi array

        int [][] multiArr={{10,20,30},{40,50},{60,70,80,90}}; // declaring multi-array and storing values right away.
        System.out.println(Arrays.deepToString(multiArr)); // I need to import array util packages and then use deep to string method to print entire multidimensional array.

        System.out.println(Arrays.toString(multiArr[1])); // Retrieving the array store in index 1, and to print it I use Arrays util package and use to string method because it is only printing one array.

        System.out.println(multiArr[2][2]); //no need to use Array util package because it is retrieving a int value so it prints directly.


    }
}
