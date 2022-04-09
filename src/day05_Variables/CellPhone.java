package day05_Variables;

public class CellPhone {
    public static void main(String[] args) {

        String brand= "Apple";
        String model="Iphone13";
        String color ="Blue";
        double price= 950.65;
        int storage=128;
        boolean hasCamera = true;
        boolean noCamera= false;
        char sim = 'A';

        System.out.println("brand = " + brand);
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = " + price);
        System.out.println("storage = " + storage);
        System.out.println("hasCamera = " + hasCamera);
        System.out.println("noCamera = " + noCamera);
        System.out.println("sim = " + sim);

        System.out.println("I have an "+model+" from "+brand+ ". It came in the color "+ color+" it has "+storage+" GB "+". It costed "+ price+ " it has a camera "+ hasCamera+ " with a sim "+ sim);

        String fullMessage= "I have an "+ model+ " from " +brand+ ". \nIt came in the color " + color+ " it has " +storage+ " GB "+ ". \nIt costed "+ price + "it has a camera " + hasCamera + " with a sim "+ sim;
        System.out.println(fullMessage);
    }
}
