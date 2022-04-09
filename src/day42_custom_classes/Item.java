package day42_custom_classes;

public class Item {
    String name;

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    double price;
}
