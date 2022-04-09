package day22_loops2;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int accurateGuess=7;
        int guessingNum=0;//3


        do {
            System.out.println("Enter your guessing number:");
            guessingNum= scan.nextInt();

            if(guessingNum>accurateGuess){
                System.out.println("too high");
            }else if(guessingNum<accurateGuess){
                System.out.println("too low");
            }
        }while(accurateGuess!=guessingNum);

        System.out.println("you guessed correctly ");
    }
}
