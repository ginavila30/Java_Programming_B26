package day37_wrapperclass;

public class ValueOfVSParse {
    public static void main(String[] args) {
        String s="30";


        int seconds= Integer.parseInt(s);// converting 30 String in to and int value 30.
        Integer.valueOf(s);// Converts the 30 String in to the Integer wrapper class object.
        int i2=Integer.valueOf(s);// This is showing the unboxing, because Integer wrapper object is being transformed in to int primitive data types.

        // Important Note: parse returns a primitive data type, value of returns object type(wrapper class).
    }
}
