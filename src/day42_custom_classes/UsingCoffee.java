package day42_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {
        Coffee numberOne =new Coffee();

        numberOne.type="Capuccino";
        numberOne.size=16;
        numberOne.brand="Starbucks";
        numberOne.price=5.7;

        System.out.println(numberOne);
        numberOne.drink();
        numberOne.refill(2.5);
        System.out.println(numberOne);
    }
}
