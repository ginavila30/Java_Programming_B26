package day63_functional_interfaces;

import day54_05_03_2022.creating.Create;

import java.util.Arrays;

/*Create a functional interface named ListFunction and define the following abstract method:

	generic type: <T, R>

	R apply(List<T>  list);

	Use ListFunction functional interface to:
		*/
public class UseListFunction {
    public static void main(String[] args) {

        //1.1 Create a function that can return the maximum number from a list of Integer
        // T            R
        ListFunction<Integer, Integer> maximumNumber = (list) -> {

            Integer max = 0; //I can use Collections.max(list);
            for (Integer each : list) {
                if (each > max) {
                    max = each;
                }
            }
            return max;
        };

        System.out.println("Max Num:" + maximumNumber.apply(Arrays.asList(15, 8, 7, 9, 25)));

        //1.2 Create a function that can return the minimum number from a list of Integer

        ListFunction<Integer, Integer> minNumber = (list) -> {
            Integer min = Integer.MAX_VALUE; //Collections.max(list);
            for (Integer each : list
            ) {
                if (each < min) {
                    min = each;
                }
            }
            return min;
        };

        System.out.println("Minimum Num: " + minNumber.apply(Arrays.asList(15, 8, 7, 9, 25)));

        //1.3 Create a function that can return the longest String from a List of String
        ListFunction<String,String>longestString=(list)->{
            int longest=list.get(0).length();
            String longestStr="";

            for (String each:list) {
                if(each.length()>longest){
                    longest=each.length();
                }
            }
            for (String each:list) {
                if(each.length()==longest){
                    longestStr+=each+" ";
                }
            }
            return "Longest String-> "+longestStr.trim();
        };
        System.out.println(longestString.apply(Arrays.asList("one", "two", "ax", "me")));

        //1.4 Create a function that can return the shortest String from a List of String
        ListFunction<String,String>shortestString=(list)->{
            int shortest=list.get(0).length();
            String shortestStr="";

            for (String each:list) {
                if(each.length()<shortest){
                    shortest=each.length();
                }
            }
            for (String each:list) {
                if(each.length()==shortest){
                    shortestStr+=each+" ";
                }
            }
            return "Shortest String-> "+shortestStr.trim();
        };
        System.out.println(shortestString.apply(Arrays.asList("one", "two", "ax", "me")));

        //1.5 Create a function that can convert List of integer to int array

        ListFunction<Integer,int[]> convertListToArray= list->{
            int[]arr=new int[list.size()];
            for (int i = 0; i < list.size() ; i++) {
                arr[i]= list.get(i);
            }

            return arr;

        };
        System.out.println(Arrays.toString(convertListToArray.apply(Arrays.asList(5, 4, 9, 12, 7))));

       //1.6 Create a function that can convert List of double to double array

        ListFunction<Double,double[]> convertDoubleListToArray = (list)->{
            double[]arr=new double[list.size()];
            for (int i = 0; i < list.size() ; i++) {
                arr[i]= list.get(i);
            }
            return arr;
        };
        System.out.println(Arrays.toString(convertDoubleListToArray.apply(Arrays.asList(5.0, 7.0, 8.0, 9.0, 6.0, 1.0))));
    }
}
