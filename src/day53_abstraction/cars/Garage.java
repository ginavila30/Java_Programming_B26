package day53_abstraction.cars;

public class Garage {

    public static void main(String[] args) {
      //   Car obj1=new Car(); Car is an abstract class, and we can't create objects from abstract class.
        Toyota obj2=new Toyota();
        obj2.start();

        Honda obj3=new Honda();
        obj3.start();

        //Both Toyota and Honda were concrete classes, because they were not abstract, so we had to create implementation of method start for each of them.

        //ElectricCar obj4=new ElectricCar(); ElectricCar is an abstract class, and we can't create objects from abstract class.

        Tesla obj5=new Tesla();//Tesla is a concrete class (first class to inherit abstract class), which means it had to override all the abstract methods from the superclasses
        obj5.charge();
        obj5.start();
    }
}
