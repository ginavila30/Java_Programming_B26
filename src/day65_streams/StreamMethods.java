package day65_streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {



    public static void main(String[] args) {
        //Creating streams
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr);

        List<Integer> list = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 2));
        list.stream();

        //distinct(): remove duplicates

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 2, 4, 4, 5, 5, 6, 1, 1, 2, 2));
        System.out.println("Distinct Method->" + list2.stream().distinct().collect(Collectors.toList()));
        //.stream() converts list  to a stream.
        // .distinct() removes duplicates
        //.collect(Collectors.toList()) converts stream back to a list.
        System.out.println("Original List->" + list2);// original list is not modified

        int[] arr2 = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 8, 8};
        arr2 = Arrays.stream(arr2).distinct().toArray(); // reassigning value after stream
        System.out.println("Array" + Arrays.toString(arr2));

        //skip()
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Skip Example 1"+list3.stream().skip(4).collect(Collectors.toList()));
        System.out.println("Skip Example 2"+list3.stream().skip(3).collect(Collectors.toList()));
        System.out.println("Skip Example with Array"+Arrays.toString(Arrays.stream(arr2).skip(3).toArray()));

        //limit()
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Limit Example with collections->"+list4.stream().limit(6).collect(Collectors.toList()));
        System.out.println("Limit Example with Array->"+Arrays.toString(Arrays.stream(arr2).limit(6).toArray()));
        System.out.println("Example mixing skip and limit at the same time->"+list4.stream().skip(4).limit(3).collect(Collectors.toList()));

        //Count()
        List<Integer>list5=new ArrayList<>(Arrays.asList(1,1,1,2,2,3,5,6,3,5));
        System.out.println("Example of count->"+list5.stream().count());//total elements.
        System.out.println("Example of count with distinct->"+list5.stream().distinct().count());//Unique elements
        //How many letters in the String (no duplicates)
        String s ="aaabbbcccdddeee";
        System.out.println("Exmple of converting String to array and the list->"+Arrays.stream(s.split("")).collect(Collectors.toList()));
        System.out.println("Example of counting unique letters in the string"+Arrays.stream(s.split("")).distinct().count());



    }
}
