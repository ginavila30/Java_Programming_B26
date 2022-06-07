package testing_or_explanations;

import java.util.*;

public class CodingBat {
    public static boolean gHappy(String str) {
        boolean happy = false;

        if (str.length() >= 2) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'g') {
                    if (i != 0 && i != str.length() - 1) {
                        if (str.charAt(i - 1) == 'g' || str.charAt(i + 1) == 'g') {
                            happy = true;
                        } else {
                            happy = false;
                        }
                    } else {
                        if (i == 0) {
                            if (str.charAt(i + 1) != 'g') {
                                happy = false;
                            }else{happy = true;}
                            }
                        else {
                            if (str.charAt(i - 1) != 'g') {
                                happy = false;
                            }else{happy =true;}
                        }
                    }
                }
            }
        }else{if(str.isEmpty()){happy = true;}}

        return happy;
    }


    public static void main(String[] args) {

        System.out.println(gHappy("gg"));
    }
}

