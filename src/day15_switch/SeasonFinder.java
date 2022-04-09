/*Season Finder

declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own expectations of what kind of clothes to wear based on the month


	12, 1, 2 	--> Winter
	3, 4, 5 	--> Spring
	6, 7, 8 	--> Summer
	9, 10, 11 	--> Fall

Ex:
	2
	It is winter, so wear a winter coat, gloves and a hat*/
package day15_switch;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the month number:");
        int month= scan.nextInt();
        String seasonName="";
        String clothes="";
        boolean valid=true;

        switch(month){
            case 12: case 1: case 2:
                seasonName="Winter";
                clothes="Jacket, Gloves and hat.";break;
            case 3: case 4: case 5:
                seasonName="Spring";
                clothes="Rain coat and rain boots.";break;
            case 6: case 7: case 8:
                seasonName="Summer";
                clothes="Shorts, sandals, sunglasses.";break;
            case 9: case 10: case 11:
                seasonName="Fall";
                clothes="Cardigans, boots and scarfs.";break;
            default:
                System.out.println("Invalid number");
                valid= false;

        }
       if(valid) System.out.println("It is "+seasonName+", so wear "+clothes);

    }
}
