package testing_or_explanations;

import java.util.*;

public class CodingBat {
    public static String notReplace(String str) {
        String result="";
        for(int i=0; i<str.length()-1;i++){
            if(str.charAt(i)=='i'&& str.charAt(i+1)=='s' && (!Character.isLetter(str.charAt(i+2))||i==str.length()-1))
            {
                result+="is not";
                i++;
            }else{
                result+=str.charAt(i);
            }

        }
        return result;
    }


    public static void main(String[] args) {

        System.out.println(notReplace("This is isabell"));
    }
}

