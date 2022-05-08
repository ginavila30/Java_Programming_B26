package day55_polymorphism.shopping;
/*Create a concrete class Ebay
    - Make the class final
    - Inherit OnlineShopping and implements interface AllowUsersToSell interface
    - Implement all abstract methods*/
public final class Ebay extends OnlineShopping implements AllowUserToSell {
    @Override
    public void uploadProduct() {
        System.out.println("Uploading product");
    }

    @Override
    public void viewCart() {
        System.out.println("Viewing Ebay cart");
    }

    @Override
    public void payForShipping(boolean payForShipping) {
        System.out.println("Do you pay for shipping at Ebay? "+(payForShipping?"yes":"no"));
    }

    @Override
    public void buyItem() {
        System.out.println("Buying an item from Ebay ");
    }

    @Override
    public void returnItem() {

    }
}
