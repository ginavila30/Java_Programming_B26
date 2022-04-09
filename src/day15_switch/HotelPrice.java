
/*Ask the user how many days they will stay at the hotel
Then ask the user how many people are in their party (how many people are staying in the room)

Use those two information to determine the price and room type for the hotel based on the below data:

	party size: 1
	room type: single room
	price: number of days * 100

	party size: 2
	room type: double room
	price: number of days * 125

	party size: 3 or 4
	room type: large room
	price: number of days * number of people * 150

	party size: 5, 6, or 7
	room type: suite
	price: number of days * 5000

	any other party size:
		Display one message:
			Sorry we don't have any available rooms for that size party*/
package day15_switch;

import java.util.Scanner;

public class HotelPrice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many days are you staying?");
        int stayDays= scan.nextInt();
        System.out.println("How many people are staying in the room?");
        int partySize= scan.nextInt();
        String roomType="";
        double roomRate=0.0;
        double totalPrice=0.0;
        boolean valid=true;
        switch(partySize){
            case 1:
                roomType="single room";
                roomRate=100;
               break;
            case 2:
                roomType="double room";
                roomRate=125;
                break;
            case 3: case 4:
                roomType="large room";
                roomRate=150;
                break;
            case 5: case 6: case 7:
                roomType="suite";
                roomRate=5000;
               break;
            default:
                System.out.println("Sorry we don't have any available rooms for that size party");
               valid =false;
        }
        if(valid&&(partySize==1||partySize==2||partySize==5||partySize==6||partySize==7)){
            totalPrice=stayDays*roomRate;
            System.out.println("Party size-->"+partySize+"\nRoom Type-->"+roomType+"\nPrice-->"+totalPrice);
        }
        if (valid&&(partySize==3||partySize==4)){totalPrice=stayDays*partySize*roomRate;
            System.out.println("Party size-->"+partySize+"\nRoom Type-->"+roomType+"\nPrice-->"+totalPrice);}


    }}

