package testing_or_explanations.CodingPractice;
//given an input string find the longest substring with no repetitive chars
import java.util.ArrayList;
import java.util.Arrays;

public class LongestSubStrUniqueChars {
    public static void main(String[] args) {
        String str="abcdadef";
        String sub="";
        ArrayList<String>list=new ArrayList<>();
// find all possible substring with nested loop
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i; j <str.length() ; j++) {
              list.add(  str.substring(i,j+1));
            }
        }
        ArrayList<String>uniqueChars=new ArrayList<>();
// find substrings with unique chars with nested loop
        for (String each:list) {
            String check="";
            boolean unique = true;

            for (int i = 0; i <each.length() ; i++) {
                if(!check.contains(""+each.charAt(i))){
                    check+=each.charAt(i);
                }else {
                    unique=false; break;
                }
            }
            if(unique){uniqueChars.add(each);}
        }
// find longest substring
        String longest= uniqueChars.get(0);

        for (String each:uniqueChars) {
            if(each.length()>=longest.length()){
                longest=each;
            }
        }
      //  int length=longest.length();
       // uniqueChars.removeIf(each-> each.length()!=length);
      //  System.out.println(uniqueChars);

        //find any substrings same length
String res="";
        for (String each:uniqueChars) {
            if(each.length()==longest.length()){
                res+=each+" ";
            }
        }

        // return string if only one, return array if more than one.
        if(res.trim().contains(" ")){
            System.out.println(Arrays.toString(res.split(" ")));
        }else {
            System.out.println(res);
        }


    }
}
