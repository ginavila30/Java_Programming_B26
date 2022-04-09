package day37_wrapperclass;

public class WrapperClassObject {
    public static void main(String[] args) {
        int a=5;// Primitive-> we can assign, reassign, math, casting. We can not use methods since it is not an object.

        //Below converting primitive data type in to object
        Integer a2=new Integer(10);// this is crossing the word because it is warning that it is not needed. I can put the value directly without new.
        Integer a3=20;// Automatically passing from primitive to object by autoboxing.
        int a4=a3;//Unboxing-> from object to primitive.

        byte b=2;
        Byte b2=20;
    }
}
