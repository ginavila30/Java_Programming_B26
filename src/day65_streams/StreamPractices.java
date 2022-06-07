package day65_streams;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractices {
    // 1. Write a program that can remove the duplicated elements of an array of String*/
    public static Object[] removeDuplicateStrArr(Object[] arr) {

        return Arrays.stream(arr).distinct().toArray();
    }
    //2. Write a program that can remove the duplicated elements of a List of String
    public static List<String> removeDuplicatesOfList(List<String>list){
        return list.stream().distinct().collect(Collectors.toList());
    }
    //3. Write a program that can count how many "java" and "python" does the array has:
    //            ex: array = {"Java", "jAVa", "pythON"}
    //
    //            output:
    //                countJava = 2
    //                countPython = 1
    public static void countJava_Python(String[]arr){
        System.out.println("Java-> "+Arrays.stream(arr).filter(each -> each.equalsIgnoreCase("java")).count());
        System.out.println("Python-> "+Arrays.stream(arr).filter(each -> each.equalsIgnoreCase("python")).count());
    }
    // 4. Write a program that can count how many negative numbers does the array has
    //        ex: arr = {1,2,3,4,-4,5,-5}
    //
    //        output:
    //            2
    public static int countNegativeNums(int[]arr){
       return (int) Arrays.stream(arr).filter(each->each<0).count();
    }
    // 5. Write a program that can count how many Positive numbers does the List has
    //        ex: List = {1,2,3,4,-4,5,-5}
    //
    //        output:
    //            5
    public static int countPositiveNums(int[]arr){
        return (int) Arrays.stream(arr).filter(each->each>0).count();
    }
    //6. Write a program that can return all the negative numbers of the array as a new array
    //        ex:
    //            arr = {1,2,3,4,-4,5,-5}
    //
    //        output:
    //            {-4, -5}
    public static int[] negativeNumsArr(int[]arr){
       return Arrays.stream(arr).filter(each->each<0).toArray();
    }
    //7. Write a program that can return all the positive numbers of List without the dupclaites
    //        ex:
    //            list = {1,2,3,4,-4,5,-5,1,2,3,4}
    //
    //        output:
    //            {1,2,3,4,5}
    public static List<Integer> positiveNonDuplicates(List<Integer>list){
        return list.stream().filter(each-> each>0).distinct().collect(Collectors.toList());
    }
    // 8. Write a program that can return the palindrome Strings from a list:
    //        Ex:
    //            list = {"Java", "level", "Anna", "Wooden Spoon"};
    //
    //        output:
    //            {"level", "Anna"}
    public static List<String> palindrome(List<String>list){

        return list.stream().filter(each-> {
            String reversed="";
            for (int i = each.length()-1; i >=0 ; i--) {
                reversed+=each.charAt(i);
            }
       return each.equalsIgnoreCase(reversed);}
        ).collect(Collectors.toList());
    }
    // 9. Write a program that can return the unique elements of an array as a new array:
    //
    //        Ex: arr = {1,1,2,3,3,4,5,5,6};
    //
    //        output:
    //            {2,4,6}

    public static Object[] uniqueElements(Object[]arr){
        ArrayList<Object>list= new ArrayList<>(Arrays.asList(arr));
       return Arrays.stream(arr).filter(each-> Collections.frequency(list, each) == 1).toArray();
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicateStrArr(new String[]{"he", "he", "she", "you"})));
        System.out.println(removeDuplicatesOfList(new ArrayList<>(Arrays.asList("he", "she", "you", "she"))));
        countJava_Python(new String[]{"Java", "jAVa", "pythON","PYTHON","jAvA"});
        System.out.println(countNegativeNums(new int[]{1, 2, -3, 4, -4, 5, -5}));
        System.out.println(countPositiveNums(new int[]{1, 2, -3, 4, -4, 5, -5}));
        System.out.println(Arrays.toString(negativeNumsArr(new int[]{1, 2, 3, 4, -4, 5, -5})));
        System.out.println(positiveNonDuplicates(new ArrayList<>(Arrays.asList(1, 2, 3, 4, -4, 5, -5, 1, 2, 3, 4))));
        System.out.println(palindrome(new ArrayList<>(Arrays.asList("Java", "level", "Anna", "Wooden Spoon"))));
        System.out.println(Arrays.toString(uniqueElements(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 6})));


    }
}
