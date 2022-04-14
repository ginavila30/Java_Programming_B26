package day46_static;

public class BestBuy {
    String location;// instance vx
    //static vx below
    static String headquarters= "Richfield, Minesota, USA";
    static String day="Wednesday";
    static int numberOfComputers=100;
    //Constructor below
    public BestBuy(String location){this.location=location;}
    //Creating a static method
    public static void restock(){
        numberOfComputers+=20;
    }
    //creating instance method
    public void openStore(){
        System.out.println("Opening the "+location);
    }
}
