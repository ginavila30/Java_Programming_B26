package day47_encapsulation;

public class Road {
    public static void main(String[] args) {
        TrafficLight obj1= new TrafficLight("Red");
//        The lines below are error because color instance vx is private, therefore I must use getter and setter.
//        System.out.println(obj1.color);
//        obj1.color="pink";
        System.out.println(obj1.getColor());
        obj1.setColor("pink");
        System.out.println(obj1.getColor());// no change because it is not one of the valid options.
        TrafficLight obj2=new TrafficLight("brown"); // Object color will be null because constructor has setter method which controls only valid inputs
        System.out.println(obj2);
        TrafficLight obj3=new TrafficLight("Green"); // This is a valid input so it is assigned to the instance vx.
        System.out.println(obj3);

    }
}
