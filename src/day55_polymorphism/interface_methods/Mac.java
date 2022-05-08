package day55_polymorphism.interface_methods;

public interface Mac {
    String NAME="MAC";//Public static final variables
    String OS="IOS";

    void turnOn();//public abstract method

    //How to create method with implementation in interface
    // One way is through static methods
    static void company(){
        System.out.println("Apple");
        System.out.println("HQ is LA");
        System.out.println("New release in Nov");
    }
    //Another way through default keyword method, not access modifiers. the default keyword allow me to create implementation for a method in an interface.
    public default void facTime(){
        System.out.println("Opening FaceTime");
        System.out.println("Calling someone");

    }
}
