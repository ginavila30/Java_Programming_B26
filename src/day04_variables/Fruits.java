package day04_variables;

public class Fruits {
    public static void main(String[] args) {

        int apples = 50;
        int grapes = 100;
        int bananas = 150;

        System.out.println("This is how many apples we have: "+ apples); // Concatenation: I use "+" sign to combine different parts together. in this case text+ value of variable.
        System.out.println("Grapes amount: " +grapes);
        System.out.println("Bananas amount: "+bananas);

        System.out.println("sold some apples");
        apples=25; // This is how I reassigned value to the Vx.

        System.out.println("Apples after selling "+apples);
        System.out.println("The price of my "+ apples+" apples is $20"); //Concatenation example.

        grapes= 80;

        System.out.println("I have "+grapes+ " grapes in my fridge"); // reassigning value and concatenation example.



    }
}
