package day52_final_key_word.hiding;

public class CallMethods {
    public static void main(String[] args) {
        A obj=new A();
        obj.instanceMethod();
        A.staticMethod();

        B obj2=new B();
        obj2.instanceMethod();
        B.staticMethod();
    }
}
