package day51_inheritance.device;

public class TV extends Device {
//    Create a class called TV:
//            - attributes: brand, model, price, wireless
//- methods: toString(),
//    useDevice(): Override to print Using TV

    public TV(String brand, String model, double price, boolean isWireless){
        super(brand, model, price, isWireless);
    }

    // To string is inherited from device.

    @Override
    public void useDevice(){
        System.out.println("Using TV");
    }

}
