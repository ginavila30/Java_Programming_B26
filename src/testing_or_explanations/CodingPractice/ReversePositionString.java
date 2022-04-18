package testing_or_explanations.CodingPractice;

import java.util.Arrays;

public class ReversePositionString {
    public static void main(String[] args) {
        String str="I love java";
        String[]arr=str.split(" ");
String result="";
        for (int i = arr.length-1; i>=0 ; i--) {
            result+=arr[i]+" ";
        }
        System.out.println(result);
        String []arr2=result.split(" ");
        int count=0;
        for (String each:arr2) {
            String newWord="";

            for (int i=each.length()-1; i>=0 ; i--) {
                newWord+=each.charAt(i);
            }
            arr2[count++]=newWord;
        }

        System.out.println(Arrays.toString(arr2));

    }
}
