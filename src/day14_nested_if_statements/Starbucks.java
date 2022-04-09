package day14_nested_if_statements;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to Starbucks");
        System.out.println("What size of drink do you want?");
        String size= scan.nextLine();
        double price=0.0;
        int calories=0;
        boolean validOrder=true;

        switch(size){
            case "tall":


                price=2.50;
                calories=100; break;
            case "grande":

                price=4.00;
                calories=150;break;
            case "venti":

                price=4.50;
                calories=200;break;
            default:
                System.out.println("not an option available");
                validOrder=false;

        }

        if(validOrder){System.out.println("Drink Information"+"\nSize->"+size+"\nPrice->"+price+"\nCalories->"+calories);}
    }
}
