package day55_polymorphism.shopping;

public class Runner {
    public static void main(String[] args) {
        Target target=new Target();
        target.price=10;
        target.buyItem();
        target.returnItem();
        System.out.println(target.price);

        Amazon amazon=new Amazon();
        amazon.price=1000;
        amazon.buyItem();
        amazon.returnItem();
        amazon.payForShipping(true);
        System.out.println(amazon.price);
        System.out.println(Shipping.COUNTRY);
    }

}
