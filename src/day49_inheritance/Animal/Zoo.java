package day49_inheritance.Animal;

import day49_inheritance.Animal.Animal;
import day49_inheritance.Animal.Dog;
import day49_inheritance.Animal.Lion;

public class Zoo {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.species="Generic Animal";
        animal.numberOfLegs=0;
        animal.walk();

        Dog dog=new Dog();
        dog.species="Dog";
        dog.numberOfLegs=4;

        Lion lion=new Lion();
        lion.species="Lion";
        lion.numberOfLegs=4;
        lion.maneSize=10;


    }

}
