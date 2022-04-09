package day29_arrays;

public class Store {
    public static void main(String[] args) {
        String [] items = {"Shoes", "Jackets", "Gloves", "AirPod", "Ipod", "Backpack" };
        double [] prices = { 89.99, 150.0, 399.99, 250.0, 439.5, 39.99 };
        int [] itemIds = { 12345, 12346, 12347, 12348, 12349, 12350 };

        // Print catalog

        for (int i = 0; i < items.length ; i++) {

            System.out.println("Item ID "+itemIds[i]+" are "+items[i]+ " They cost $"+ prices[i]);
        }

        // Find the index of Gloves

        int indexOfGloves= -1; // I assigned - 1 as a default because if I don't find index of gloves then I will get that. Not 0 because o is a valid index.

        for (int i = 0; i < items.length ; i++) {
            if (items[i].equalsIgnoreCase("gloves")){
               indexOfGloves=i;
               break;
            }
        }
        System.out.println("Index of gloves: "+indexOfGloves);

        // Task: Find and print the information of the most expensive item.

        double mostExpensive= prices[0];
        int indexOfMostExpensive=0;
        for (int i = 1; i < prices.length ; i++) {
            if (prices[i]>mostExpensive){
                mostExpensive=prices[i];
                indexOfMostExpensive=i;
            }
        } System.out.println("Most Expensive \nItem: "+items[indexOfMostExpensive]+"\nID: "+itemIds[indexOfMostExpensive]+"\nPrice: $"+mostExpensive);
    }
}
