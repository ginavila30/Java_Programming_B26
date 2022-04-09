package day22_loops2;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        int repetition =0;
        String uniqueColors="";

        while(repetition<3){

            System.out.println("Enter the color you want");
            String color= scan.nextLine();
            boolean repeated=uniqueColors.contains(color);
            if(!repeated)
            {uniqueColors+=color+" ";
                repetition++;}
            else{
                System.out.println("Color is repeated");
            }
        }System.out.println(uniqueColors);
    }
}
