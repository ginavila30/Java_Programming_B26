package day16_Review;

import java.util.Scanner;

public class SoccerGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter How many minutes left in the game:");
        int minutes = scan.nextInt();
        String message;

        if (minutes >= 0 && minutes <= 90) {

            if (minutes >= 75) {
                message = "just getting started";
            } else if (minutes >= 60) {
                message = " players are doing their best";
            } else if (minutes >= 30) {
                message = "middle of the game is going great";
            } else {
                message = "the end of the game is approaching";
            }

        } else { if (minutes < 0) {
            message = "minutes cannot be a negative number";
        } else {
            message = "games cannot be longer than 90 minutes";
        }
        }
        System.out.println(message);
    }}
