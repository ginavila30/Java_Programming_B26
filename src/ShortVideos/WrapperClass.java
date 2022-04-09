package ShortVideos;

public class WrapperClass {
    public static void main(String[] args) {
        byte a=10;
        short b=20;
        int c=30;
        //Wrapper Class-> converting primitive types into object types (autoboxing)

        Byte x=a;
        Short y=b;
        Integer z=c;

        //Unboxing-> objects in to primitive types

        byte l=x;
        short m=y;
        int n=z;

        //Parse methods -> converting String into the primitive data type.->return int.
        String str="123";
        //converting String in to integer
       int num1= Integer.parseInt(str);// this is a non primitive data types
        System.out.println(num1);
        //valueOfMethod-> converts String to the wrapper class objects, returns wrapper class object.

        String str2="1.5";
        Double e =Double.valueOf(str2);// this is an object
        System.out.println(e);
    }
}
