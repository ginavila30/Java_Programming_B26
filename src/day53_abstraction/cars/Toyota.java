package day53_abstraction.cars;

public class Toyota extends Car{//inheriting an abstract class

    @Override
    public void start(){//overriding method from parent abstract class. I get rid of the abstract keyword when overriding.
        System.out.println("Insert key");
        System.out.println("Turn the key");
    }
}
