package day36_methods;

public class OverloadAndReturn {
    public static void method() {
        System.out.println("default empty method");
    }
    // I can't overload by changing the return type. It is not valid.
    // I can overload by changing parameters, and I can change return type if I overloaded.
    public static int method(int a) {
        //"I overloaded the method by changing parameters, and change the return type to int instead of void")
        return 0;
    }

}