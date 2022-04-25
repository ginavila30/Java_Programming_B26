package day51_inheritance.device;

public class Phone extends Device {
    /*Create a class called Phone:
- attributes: brand, model, price, isWireless
- methods: toString(),
	useDevice(): Override to print Using Phone
*/
    public Phone(String brand,String model,double price,boolean isWireless){
        super(brand,model,price,isWireless);
    }

    @Override
    public void useDevice(){
        System.out.println("Using Phone");
    }
}
