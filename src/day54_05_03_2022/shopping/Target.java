package day54_05_03_2022.shopping;
/*Create a concrete class Target
    - Make the class final
    - Inherit Shopping and implement all abstract methods*/
public final class Target extends Shopping{
    @Override
    public void buyItem() {
        System.out.println("Buying at Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning at Target");
    }
}
