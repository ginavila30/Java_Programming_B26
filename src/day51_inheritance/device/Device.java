package day51_inheritance.device;

public class Device {
    /*Create a class called device:
- attributes: brand, model, price, wireless
- methods: toString(), useDevice()*/

    public String brand;
    public String model;
    public double price;
    public boolean isWireless;

    public Device(String brand, String model, double price, boolean isWireless){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.isWireless=isWireless;
    }

    public void useDevice(){
        System.out.println("Using device");
    }
    public String toString(){
        return "Brand->"+brand+" Model->"+model+" Price-> $"+price+" Is wireless->"+isWireless;
    }
}
