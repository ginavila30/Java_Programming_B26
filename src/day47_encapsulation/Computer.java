package day47_encapsulation;

public class Computer {
    double price;
    String brand;
    String color;

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    static {
        System.out.println("Static block run");
        hasScreen=true;
        hasBattery=true;
        hasMemory=true;
    }

    public Computer(double price, String brand, String color){
        System.out.println("Constructor run");
        this.price=price;
        this.brand=brand;
        this.color=color;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
