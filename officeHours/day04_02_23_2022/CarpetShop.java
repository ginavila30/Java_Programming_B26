package day04_02_23_2022;

import java.util.Locale;
import java.util.Scanner;

public class CarpetShop {

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Which room do you need carpet in?\n\tList of rooms:\n\t\tBedroom\n\t\tKitchen");
            String room= scan.nextLine().toLowerCase(Locale.ROOT);
            String message="";
            double area=0;
            double unitCarpetPrice=3.92;
            boolean valid=true;
            String deliveryAddress="";

            if ((room.equalsIgnoreCase ("Bedroom")|| room.equalsIgnoreCase("Kitchen"))){
                if (room.equalsIgnoreCase("Bedroom")){
                    System.out.println("Enter the length:");
                    double roomLength= scan.nextDouble();
                    System.out.println("Enter the Width");
                    double roomWidth= scan.nextDouble();
                    area= roomLength*roomWidth;
                }else {
                    System.out.println("Enter the radius:");
                    double roomRadius = scan.nextDouble();
                    area = roomRadius * roomRadius* 3.1416;
                }
                System.out.println("What is the delivery address:");
                scan.nextLine();
                deliveryAddress=scan.nextLine();


            }else{
                System.out.println("Invalid Room Type");
                valid=false;}

            double totalCost=area*unitCarpetPrice;

            message= "Total cost for your carpet is "+totalCost+" and it will be delivered to "+deliveryAddress+" in one week";

            if(valid)System.out.println(message);
        }


    }

