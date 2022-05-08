package day55_polymorphism.interface_methods;

public class MacbookPro implements Mac{
    @Override
    public void turnOn() {
        System.out.println("Mac is turning on");
    }




}

class runner{
    public static void main(String[] args) {
        System.out.println(Mac.NAME);
        System.out.println(MacbookPro.NAME);//  I can also call the static variable by the class name that inherited it.
        MacbookPro macbookPro=new MacbookPro();
        macbookPro.turnOn();
        Mac.company();
    }
}
