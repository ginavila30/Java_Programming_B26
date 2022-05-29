package day63_functional_interfaces;

public class CallingConsumerMethod {
    public static void main(String[] args) {
        UseConsumerInterface.printNameInCaps.accept("gina");
    }
}
