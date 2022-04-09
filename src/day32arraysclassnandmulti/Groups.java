package day32arraysclassnandmulti;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        // String [][] cydeo=new String[4][3]; // Example of how to declare multi array when I do not know teh values yet. The first square bracket is for the size of the array (how many arrays will be inside cydeo array(4)), second square bracket is for the number of elements (3)for each array inside cydeo array.
        String[][] cydeo = new String[4][];// no number in second square brackets, because inner arrays ara different sizes.
        System.out.println("Adding group 1");
        String[] group1 = {"Emre", "Yasir", "Eda"}; // created a single array with values.
        cydeo[0] = group1;// Assigned the single array to the first index of my inner array.
        System.out.println("Adding group 2");
        String[] group2 = {"Basri", "Demet", "Shina", "Ismayil"};
        cydeo[1] = group2;
        System.out.println("Adding group 3");
        cydeo[2] = new String[]{"Mustafa", "Lima"};// when assigning directly in to the multi array calling the inner array. I should use "new" approach and then {}. I cannot use onl {}.
        System.out.println("Same group 3 as group 4");
        cydeo[3] = cydeo[2];// here if i modify anything  in cydeo[2] it will change cydeo 3. to make it separate so that modification in one does not modify the other I should use copy of as follow: cydeo[3] = Arrays.copyOf(cydeo[2],cydeo[2].length);
        System.out.println("Loop");

        for (String[] innerArray:cydeo) { // loops through the 2d array. Pulls each inner array. In this loop I am iterating through arrays, so I need [].
            Arrays.sort(innerArray); // Sorting the array by alphabet.


            for (String eachWord:innerArray) {// Loops through every String element in each 1d inner array. Pulls each word from each inner array. Here elements are Strings I do not need [].
                System.out.println(eachWord);// printing each name.

                System.out.println(eachWord.charAt(0));// Printing initial of each name.

            }




        }

    }
}
