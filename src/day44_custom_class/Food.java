package day44_custom_class;

public class Food {
    /*   create a class called Food
        - data:
            name, quantity, unit price, total price

        - constructor
            - create a constructor that creates a Food object with the name
            - create a constructor that creates a Food object with the name and quantity
            - create a constructor that creates a Food object with the name, quantity, and unit price
                -> call calculatePrice() method here
        - method:
            - calculatePrice(): multiple the quantity by unit price and assign the value to the total price
            - toString()
                print all the Food information*/

    String name;
    int quantity;
    double unitPrice;
    double Totalprice;
    public Food(String name){
        this.name=name;
    }
    public Food(String name, int quantity){
        this(name);
        this.quantity=quantity;
    }
    public Food(String name, int quantity, double unitPrice){
        this(name,quantity);
        this.unitPrice=unitPrice;
        calculatePrice(this.quantity,this.unitPrice);
    }
    public double calculatePrice(int quantity,double unitPrice){ return this.Totalprice=quantity*unitPrice;}

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", Totalprice=" + Totalprice +
                '}';
    }
}
