package day15_switch;
// example of id & switch together. Also we can see scanner inside the switch.
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the vending machine. \nPlease select one of the following: \n\tDrinks\n\tSnacks\n\tGum");

        String selection = scan.next();
        String vendingItem="";

        switch (selection) {
            case "Drinks":
                System.out.println("You chose drinks: Enter a number:\n\t1)Water\n\t2)Soda\n\t3)Juice");
                int drinkNumber= scan.nextInt();// example scanner inside switch.
                // below example of if statement inside switch.
                if(drinkNumber==1){
                    vendingItem="Water";
                }else if(drinkNumber==2){vendingItem="Soda";}else if(drinkNumber==3){vendingItem="Juice";}
                break;
            case "Snacks":
                System.out.println("You chose snacks: Enter a number:\n\t4)Chips\n\t5)Crackers\n\t6)PopCorn");
                int snackNumber= scan.nextInt();
                if(snackNumber==4){
                    vendingItem="Chips";
                }else if(snackNumber==5){vendingItem="Crackers";}else if(snackNumber==6){vendingItem="PopCorn";}break;

            case "Gum":System.out.println("You chose gum: Enter a number:\n\t7)Mint\n\t8)Strawberry");
                int gumNumber= scan.nextInt();
                if(gumNumber==7){
                    vendingItem="Mint";
                }else if(gumNumber==8){vendingItem="Strawberry";}
        }// end of switch
        System.out.println("Machine is vending out->"+vendingItem);
    }
}
