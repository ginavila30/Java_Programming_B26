package day44_day45_custom_class;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {
        //Creating objects by using overloaded constructors.
        Food apples = new Food("Apples");
        System.out.println(apples);
        Food chips = new Food("Lays", 2);
        System.out.println(chips);
        Food chicken = new Food("Chicken", 3, 5.99);
        System.out.println(chicken);
        // assigning values to instance vxs.
        apples.quantity = 10;
        apples.unitPrice = 1.99;
        apples.calculatePrice();
        System.out.println(apples);

        Food[] allFoods = {apples, chips, chicken, null};// array with size 4 later we will add the last element.
        System.out.println(allFoods[2]);
        allFoods[3] = new Food("Fish", 4, 3.55);// added one object element to the last position of the array.

        allFoods[1].unitPrice = 1.99; // Assigning value to unit price for chips.
        allFoods[1].calculatePrice(); // calculating price for chips
        System.out.println(Arrays.toString(allFoods));

       //Below calculating total purchase

        double totalPurchase = 0;
        for (Food each : allFoods) {
            totalPurchase += each.Totalprice;
        }
        System.out.println("The total price is: "+totalPurchase);
    }
}
