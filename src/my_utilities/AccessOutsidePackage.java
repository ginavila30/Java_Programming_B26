package my_utilities;

import day_47_encapsulation.AccessModifier;

public class AccessOutsidePackage {
    // different class, different package
    public static void main(String[] args) {
        AccessModifier obj1 = new AccessModifier();
        // I can access all the instance variable (from object) in the same class.
        System.out.println(obj1.a);
        //System.out.println(obj1.b);// I can't access b because this is default, which can only be access within same package.
        //System.out.println(obj1.c);//I can't access variable c because it is private, and private is accessible within same class only.


        // I can access all the static variable (from class) in the same class
        System.out.println(AccessModifier.x);
        //System.out.println(AccessModifier.y);// I can't access y because this is default, which can only be access within same package.
        //System.out.println(AccessModifier.z);//I can't access variable z because it is private, and private is accessible within same class only.
    }
}
