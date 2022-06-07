package day09_06_06_2022;
// Task 02 ; Reverse a given String by using any data structure
import java.util.*;

public class ReverseStringWithDataStructure {
    public static String reverseStrWithDataStructure(String str){
        String[]arr=str.split("");
        Stack<String> stack1 = new Stack<>();
        stack1.addAll(Arrays.asList(arr));
        String result = "";
       while(stack1.size()>0){result+=stack1.pop();}
        return result;
    }
    public static String reverseStrWithDataStructure2(String str){
        String[]arr=str.split("");
        List<String>list=new ArrayList<>(Arrays.asList(arr)) ;
        Collections.reverse(list);
        return list.toString().replace(",","").replace(" ","").replace("[","").replace("]","");
    }

    public static void main(String[] args) {
        System.out.println(reverseStrWithDataStructure("hello"));
        System.out.println(reverseStrWithDataStructure2("hello"));
    }
}
