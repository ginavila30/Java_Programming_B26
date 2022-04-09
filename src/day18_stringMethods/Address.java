package day18_stringMethods;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter address in one line");
        String address= scan.nextLine();
        address=address.toUpperCase().trim();
        String message="";


        if(address.startsWith("500")){
           message=""+address+"\nHouse on right side";
        }else if(address.startsWith("600")){
            message=""+address+"\nHouse on right side";
        }else {message=address;}


        if (address.contains("DRIVE")){
            message+="\nHouse on drive";
        }else if((address.contains("LANE"))){
            message+="\nHouse on lane";}
        else if(address.contains("AVENUE")){
            message+="\nHouse on avenue";
        }else {message+="";}

            System.out.println(message);
        }

    }
