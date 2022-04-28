package day53_abstraction.cars;



public class Tesla extends ElectricCar{ //this is concrete class, first regular class that inherits abstract methods. all abstract methods should be implemented
    @Override
    public void start() {//Tesla also inherited start method since Electric car inherited start abstract method from car.
        System.out.println("Card in the car");
        System.out.println("Press button");
    }

    @Override
    public void charge() {
        System.out.println("Charging Tesla");
    }
}
