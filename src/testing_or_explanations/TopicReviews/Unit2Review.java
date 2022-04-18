package testing_or_explanations.TopicReviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Unit2Review {
    // Methods -> a group of code to perform a task.
    // 2 types of methods: void type and return type.
    /* void type: does not return data we can use.
     * return type: returns a value (any kind of data type) that can be reused.
     * public -> access modifier. We call method within project.
     * static-> static modifier. We call method by the class.
     * return type: void or return
     * name of method-> mindful name.
     * (dataType name) parameter-> type of data and name that the method will receive and use.
     */
    // Void Method

    public static void uppercaseStr(String str) {
        System.out.println(str.toUpperCase());
    }

    //Return Type Method

    public static String upperCaseStrRet(String str, String str2) {
        return str.toUpperCase() + " " + str2.toUpperCase();
    }

    //Overloading Methods-> you overload by changing parameters(data type, quantity, order). We can not overload by changing return type. First change parameters then you can change return type

    public static String test(String str) {

        return str.toLowerCase();

    }

    public static int test(String str, int num) {

        return str.length() + num;

    }

    public static int sum(int[] num1, int[] num2) {
        int result = 0;
        for (int each : num1
        ) {
            result += each;
        }
        for (int each : num2) {
            result += each;

        }
        return result;

    }

    public static double sum(double... nums) {// var args-> allows creating methods that accept an array as a parameter.
        double result = 0;

        for (double each : nums) {
            result += each;
        }
        return result;

    }


    public static void main(String[] args) {
        uppercaseStr("a");// only printing the result
        //  String str = uppercaseStr("a"); Error

        System.out.println(upperCaseStrRet("java", "code"));// return data that I can work with
        String str = upperCaseStrRet("a", "b");

        System.out.println(sum(2.6, 6.8, 5.4, 8)); //var args

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 2, 4};

        System.out.println(sum(arr1, arr2));

        // Wrapper Class Review
        /*Convert primitive data types into object type (autoboxing)
         * Convert object types into primitive data types (unboxing)
         * Example int -> Integer / double -> Double .....
         * Helpful methods. parse int() value of() Character.isDigit.
         * */


        Integer x = 3;// object type
        int y = 5; // primitive type

        int unbox = x;// unboxing
        int sum = x + y;//unboxing

        System.out.println(sum);

        Integer w = 3;
        int z = 5;
        Integer autobox = z;//Autoboxing
        Integer sum2 = w + z; // Autoboxing
        System.out.println(sum2);

        //parseInt-> object to primitive.
        String stringNumber = "99"; //Object type
        stringNumber += 1;//991
        System.out.println(stringNumber);//991
        System.out.println(Integer.parseInt(stringNumber) + 1);//992

        //value of -> primitive to object.

        int n = 1578;//primitive type.
        String nInWords = String.valueOf(n);// n converted to String (ObjectType)."1578"
        System.out.println(nInWords.split(""));

        //Character.isDigit() / Character.isUppercase()/Character.isLowercase()

        /*ArrayList-> collection type. Is dynamic, only works with object types. It has useful methods.Located in java.util. no method needed to print the ArrayList.

         *Array Object-> object type. size is fixed. works with primitive and object types.Arrays.toString() is method needed to print an array object,if it is multidimensional we use Arrays.deepToString().
         */
        // Review the document Arraylist review.
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        list.add("e");
        list.add(0, "Alphabet");
        System.out.println(list.addAll(Arrays.asList("f", "g", "a")));
        System.out.println(list);
       // list.remove("a"); removes first occurrence.
        list.removeAll(Arrays.asList("a"));// removes all the occurrences of the element.
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4));
        list2.remove(1);
        list2.remove((Integer)1);
        System.out.println(list2);
        System.out.println(list2.retainAll(Arrays.asList(5, 8)));

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7,1,3));
        Collections.replaceAll(list3,1,0);
        System.out.println("**"+list3);
        System.out.println(Collections.max(list3));
        System.out.println(Collections.min(list3));

        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("#ted", "talk", "#learn"));
        System.out.println(Collections.max(list4));
        System.out.println(Collections.min(list4));


    }

}
