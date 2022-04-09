package day40_arraylist;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.isEmpty() ? "Shopping list empty" : "You have some items");
        String keepAsking;
        do {
            System.out.println("Enter an item:");
            list.add(scan.nextLine());
            System.out.println("Do you want to continue y/n");
            keepAsking = scan.nextLine();

        } while (keepAsking.equalsIgnoreCase("yes") || keepAsking.equalsIgnoreCase("y"));

        System.out.println("Shopping List: "+list.size()+" items");

        for (String each : list) {
            System.out.println("*\t"+ each);
        }
        System.out.println("------------------");

        System.out.println(list.contains("water")? "Water on list":"No water on list");

        System.out.println("Do you want to remove any items?");
        if(scan.nextLine().equalsIgnoreCase("yes")){
            System.out.println("What item do you want to remove");
            String removeItem=scan.nextLine();// it can be an object(item name) or index(number)
            if(Character.isDigit(removeItem.charAt(0))){
                int number =Integer.parseInt(removeItem);// String to int
                list.remove(number-1);// minus 1 to make sure it works with the indexes.
            }else{list.remove(removeItem);}


        }
        System.out.println("Final List: "+ list);

    }
}
