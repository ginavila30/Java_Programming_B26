package testing_or_explanations;

public class CodingBat {
    public static String withoutX(String str) {

        if(str.startsWith("x")){str=str.substring(1);}

        if(str.endsWith("x")){ str= str.substring(0,str.length()-1);}

        return str;
    }


    public static void main(String[] args) {
        System.out.println(withoutX("xHix"));
    }
}

