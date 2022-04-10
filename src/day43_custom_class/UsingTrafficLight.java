package day43_custom_class;

public class UsingTrafficLight {
    public static void main(String[] args) {
        TrafficLight light1=new TrafficLight("Green");
        System.out.println(light1.color);
        TrafficLight light2=new TrafficLight("Red");
        System.out.println(light2.color);
    }
}
