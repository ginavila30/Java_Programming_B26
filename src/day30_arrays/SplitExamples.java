package day30_arrays;

import java.util.Arrays;

public class SplitExamples {
    public static void main(String[] args) {
        String s="monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        String [] days= s.split(","); // I am separating the array based on the coma. Coma won't be included in the elements.
        System.out.println(Arrays.toString(days)); // printing the new array created.

        for (String day:days) {
            System.out.println(day);
        }
        System.out.println();
        String [] withOutDay=s.split("day");
         for(String each:withOutDay){
             System.out.println(each);
         }
        System.out.println();
         String str = "Jan-Feb-March-April-May-June-July-August-September-October-November-December";
         String [] months=str.split("-");
        for (String eachMonth:months) {
            System.out.println(eachMonth);
        }
    }
}
