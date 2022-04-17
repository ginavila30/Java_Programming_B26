package day_47_encapsulation;

import day_47_encapsulation.Computer;

public class UsingComputer {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Computer device1=new Computer(500,"Acer","Black");
        Computer device2=new Computer(1100,"Apple","Silver");

        //Accessing instance vxs-> called by object, belong to each object
        System.out.println(device1.price);
        System.out.println(device1.brand);
        System.out.println(device1.color);

        System.out.println(device2.price);
        System.out.println(device2.brand);
        System.out.println(device2.color);

        //Accessing static vxs ->called by class, belong to the class
        System.out.println(Computer.hasBattery);
        System.out.println(Computer.hasMemory);
        System.out.println(Computer.hasScreen);

        //Accessing a static vx from object. Why? because the object comes from the class and the static class is shared by all class members. However, it is not common to do it. The whole purpose is static members are called by class and instance members are called by object
        System.out.println(device1.hasBattery);


    }
}
