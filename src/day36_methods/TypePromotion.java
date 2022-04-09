package day36_methods;

public class TypePromotion {
    public static void main(String[] args) {
        use(3);// 3 is an int, and I don't have a method with an int parameter but type promotion finds the closest type available to run it. In this case long.

        use(3.5);
        use(1.2f);
        use(3l);
    }

    public static void use(float f){
        System.out.println("calling float method");
    }
    public static void use(double d){
        System.out.println("calling double method");
    }
    public static void use(long l){
        System.out.println("calling long method");
    }
}
