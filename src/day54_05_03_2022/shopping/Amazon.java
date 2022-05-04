package day54_05_03_2022.shopping;
/*Create a concrete class Amazon
    - Make the class final
    - Inherit OnlineShopping and implement all abstract methods
*/
public final class Amazon extends OnlineShopping {
    @Override
    public void returnItem() {
        System.out.println("Returning an item from Amazon");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying an item from Amazon");
    }

    @Override
    public void payForShipping(boolean payForShipping) {
        System.out.println("Do you have to pay for shipping? "+(payForShipping?"yes":"no"));
    }

    @Override
    public void viewCart() {
        System.out.println("Viewing items in Amazon cart");
    }
}
