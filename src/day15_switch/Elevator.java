/*add new class Elevator

declare and assign a floor number variable. The floor number represent which floor you want the elevator to go to. After getting to each floor show the information of which companies are on that floor. Use the following data:

	floor 1 --> Lobby, StarBucks, Amazon Pick Up
	floor 2 --> NASA, Cydeo, Discover
	floor 3 --> Uber, Lyft, Chase
	floor 4 --> Rooftop, Lounge

	any other floor value --> Invalid Floor Selected*/
package day15_switch;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the floor number:");
        int floorNum=scan.nextInt();
        String floorInfo="";


        switch (floorNum){
            case 1:
                floorInfo="Lobby,Starbucks, Amazon Pick UP";break;
            case 2:
                floorInfo="NASA, Cydeo, Discover";break;
            case 3:
                floorInfo="Uber, Lyft, Chase";break;
            case 4:
                floorInfo="Rooftop, Lounge";break;
            default: floorInfo="Invalid floor selected";break;
        }
        System.out.println("Floor "+floorNum+" ---> "+floorInfo);
    }
}
