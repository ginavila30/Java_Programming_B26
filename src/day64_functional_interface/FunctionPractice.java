package day64_functional_interface;

import java.util.*;
import java.util.function.Function;
/*Use Function functional interface to:
		1.1 Create a function that can return the sum of digits from a string that contains number digits
        1.2 Create a function that can convert a Set of Integers to List of Integers
		1.3 Create a function that can return the reversed version of a String array*/
public class FunctionPractice {
    public static void main(String[] args) {
        Function<String,Integer>sumOfDigitsStr = str->{
            Integer result =0;
            String temp="";
            for (int i = 0; i < str.length() ; i++) {
                if(Character.isDigit(str.charAt(i))){
                    temp+=str.charAt(i);
                }
                if(Character.isLetter(str.charAt(i))||i==str.length()-1){
                    if(temp.length()>0){
                        result+=Integer.parseInt(temp);
                        temp="";
                    }
                }
            }
            return result;
        };
        System.out.println(sumOfDigitsStr.apply("2h4k3h39"));
        //1.2 Create a function that can convert a Set of Integers to List of Integers
        Function<Set<Integer>, List<Integer>> convertIntegerSetToList= set->{
           List<Integer>list=new ArrayList<>(set);
            return list;
        };
        HashSet<Integer>set=new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(10);
        System.out.println(convertIntegerSetToList.apply(new HashSet<>(set)));

        //1.3 Create a function that can return the reversed version of a String array

        Function<String[],String []> reverseStringArray= arr ->{
           String[]reversed=new String[arr.length];
            for (int i = 0; i < arr.length ; i++) {
                String reversedStr="";
                for (int j = arr[i].length()-1; j>=0 ; j--) {
                    reversedStr+=arr[i].charAt(j);
                }
                reversed[i]=reversedStr;
            }
            return  reversed;
        };

        System.out.println(Arrays.toString(reverseStringArray.apply(new String[]{"ice", "cat", "hot", "dog"})));
    }
}
