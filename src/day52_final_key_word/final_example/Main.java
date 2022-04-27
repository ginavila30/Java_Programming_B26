package day52_final_key_word.final_example;

public class Main {
    public static void main(String[] args) {
        new Parent().walk();
        new Child().walk();
        // walk method was inherited but not overridden because final methods can't be overridden.
    }
}
class Parent{
    public final void walk(){
        System.out.println("You are walking");
    }
}

class Child extends Parent{
//    @Override
//    public final void walk{
//
//    }
    //WE CAN NOT OVERRIDE FINAL METHODS.
}
