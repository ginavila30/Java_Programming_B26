package day37_wrapperclass;

import java.util.Arrays;

public class CountCharacters {
    public static void main(String[] args) {
        int upperCase=0;
        int lowerCase=0;
        int nums=0;
        int others=0;

        String str="aP3d572&*jd@jdJU";
        String upperCaseChars="";

        for (int i = 0; i <str.length() ; i++) {
            char toCheck=str.charAt(i);
            if(Character.isUpperCase(toCheck)){
                upperCase++;
                upperCaseChars+=toCheck;
            }else if(Character.isLowerCase(toCheck)){lowerCase++;}else if(Character.isDigit(toCheck)){
               nums++;
            }else{others++;}
        }

        System.out.println(upperCase);
        System.out.println(lowerCase);
        System.out.println(nums);
        System.out.println(others);
        System.out.println(Arrays.toString(upperCaseChars.toCharArray()));
    }


}
