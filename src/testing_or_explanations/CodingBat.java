package testing_or_explanations;

import java.util.*;

public class CodingBat {
    public static String withoutString(String base, String remove) {
        for(int i=0; i<base.length()-remove.length(); i++){
            if(base.substring(i,i+remove.length()).equalsIgnoreCase(remove)){
                base=base.replace(remove.toLowerCase(),"");
                base=base.replace(remove.toUpperCase(),"");
                base=base.replace(remove,"");
            }
        }

        return base;

    }




    public static void main(String[] args) {
        System.out.println(withoutString("This is a FISH", "IS"));
    }
}

