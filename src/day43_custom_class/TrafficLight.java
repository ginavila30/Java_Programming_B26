package day43_custom_class;

public class TrafficLight {
    String color;

    public TrafficLight(String startColor){// startColor is a local variable. If local and instance variable have the same name java prioritizes local vx. Therefore, I will need to use this key word when assigning.
        color=startColor; // assigning local variable as value of instance variable.
    }
}
