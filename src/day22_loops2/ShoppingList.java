package day22_loops2;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String shoppingList="Shopping List:\n";
        String addMore;

        do{
            System.out.println("Enter the item:");
            String item= scan.nextLine();
            shoppingList+="\n*"+item+"";
            System.out.println("Do you want to add more items: Yes o No");
            addMore= scan.nextLine();

        }while(addMore.equalsIgnoreCase("yes")|| addMore.equalsIgnoreCase("y")||addMore.equalsIgnoreCase("ok"));


        System.out.println(shoppingList);


    }
}
