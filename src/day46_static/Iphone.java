package day46_static;

public class Iphone {
    //declaring instance vxs
    String model;
    double price;
    //declaring static vxs
    static String company;
    static String os;

    //creating static block
    static {
        System.out.println("Static block run");
        company = "apple";
        os = "ios";
    }

    // creating constructor-> helps us to create an object and initializes instance vxs.
    public Iphone(String model, double price) {
        System.out.println("Constructor run");
        this.model = model;
        this.price = price;
    }

    //creating toString method which is an instance method, that is why it does not include static vxs

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
