package day_47_encapsulation;

public class AccessInSamePackage {
    // Different class same package
    public static void main(String[] args) {
        AccessModifier obj1 = new AccessModifier();
        // I can access all the instance variable (from object) in the same class.
        System.out.println(obj1.a);
        System.out.println(obj1.b);
       // System.out.println(obj1.c); I can't access variable c because it is private, and private is accessible within same class only.

        // I can access all the static variable (from class) in the same class
        System.out.println(AccessModifier.x);
        System.out.println(AccessModifier.y);
       // System.out.println(AccessModifier.z);I can't access variable c because it is private, and private is accessible within same class only.
    }
}
