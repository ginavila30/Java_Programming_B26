package day16_Review;

import java.util.Scanner;

public class MovieCostSwitch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How long is the movie?");
        int length= scan.nextInt();
        System.out.println("How many people are watching?");
        int numOfPeople= scan.nextInt();
        double moviePrice=0.0;
        boolean valid=(length==1||length==2||length==3||length==4);

        switch(length){
            case 1:{
                moviePrice=8.99;break;}
            case 2:{
                moviePrice=10.50;break;
            }
            case 3: case 4:{
                moviePrice=15.99;break;
            }
            default:
                System.out.println("Invalid movie length");
        }
       if(valid) System.out.println("The price of the movie ticket is: $"+moviePrice+"\nThe total price is: $"+(moviePrice*numOfPeople));

    }
}
