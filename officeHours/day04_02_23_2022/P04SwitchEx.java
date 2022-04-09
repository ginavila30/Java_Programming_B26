package day04_02_23_2022;

import java.util.Scanner;

public class P04SwitchEx {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System. in);
        System.out.println("Enter the name of the animal");
        String animal= scan.next();
        String message="";

        switch(animal){
            case "Dog":
            case "Cat": message="Domestic Animal";break;
            case "Tiger": message="Wild Animal";break;
            default: message="Unknown Animal";
        }
        System.out.println(message);

    }

}
