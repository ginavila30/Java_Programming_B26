package day55_polymorphism.shopping;

public interface ConsumerApp extends Shipping, AllowUserToSell{// this interface is grouping two different interfaces in one
    //no need to override the methods because interface is for abstract methods.
}
// below implementing the 2 interfaces directly
abstract class TestA implements Shipping, AllowUserToSell{}
//below implementing the interfaces grouped in a new interface
abstract class TestB implements ConsumerApp{}


