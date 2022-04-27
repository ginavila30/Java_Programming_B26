package day52_final_key_word.hiding;

public class A {
    public void instanceMethod(){
        staticMethod();
    }
    public static void staticMethod(){
        System.out.println("Static Method, from Parent class");
    }
}
