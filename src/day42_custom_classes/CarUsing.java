package day42_custom_classes;

public class CarUsing {
    public static void main(String[] args) {
        Car carOne=new Car();

        carOne.model= "Sportage";
        carOne.year=2021;
        carOne.color="Black";
        carOne.fuelLevel=40;

        System.out.println(carOne);
        carOne.drive();
        carOne.fillTank();
        System.out.println(carOne.isLow());
    }
}
