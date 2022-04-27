package day52_final_key_word.hiding;

public class B extends A{
    @Override
    public void instanceMethod(){
       staticMethod();
    }
   // @Override We can't override the static method. But we can hide the one from parent class and declare this one in child class.
    public static void staticMethod(){
        System.out.println("Static Method, from Child class");
    }
}
