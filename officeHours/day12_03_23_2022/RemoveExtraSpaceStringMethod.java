package day12_03_23_2022;


import java.util.Arrays;

public class RemoveExtraSpaceStringMethod {
    public static  void removeExtraSpaceString(String str){
        str=str.trim();// Remove beginning and ending spaces
        String[] strChar= str.split(""); // Convert string into string array.
        boolean replace= false;// to know when to replace and not replace.

        for (int i = 0; i < str.length() ; i++) {

            if(strChar[i].equals(" ")&&!replace){
                    replace=true;
                    continue;
            }else if(strChar[i].equals(" ")&&replace){ strChar[i]="";}
            else {replace=false;}

        }
        System.out.println(Arrays.toString(strChar));
        for (String each:strChar) {
            System.out.print(each);
        }



    }

    public static void main(String[] args) {
        String str="    Hello world      I      love      Java    ";

        removeExtraSpaceString(str);
    }
}// Mehmet Approach below: Very simple.
/*public static void removeSpaces(String str) {

        String[] s = str.trim().split(" ");
        System.out.println(Arrays.toString(s));

        // System.out.println(s[2].length());  to see we have empty String

        String result="";
        for (String each : s) {

            if(!each.isEmpty()){
                result+=each+" ";
            }

        }

        System.out.println(result);


    }*/