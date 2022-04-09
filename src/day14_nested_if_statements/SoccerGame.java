/*declare and assign a minutes variable
use the minutes value to determine how much time is left in the soccer game

use these ranges to determine the outputs:

	- any number less than 0 and more than 90 are not valid:

		when the minutes is less than 0:
			print: minutes cannot be a negative number
		when the minutes is more than 90:
			print: games cannot be longer than 90 minutes

	- when the minutes are between 90 - 75
		print: just getting started

	- when the minutes are between 74 - 60
		print: players are doing their best

	- when the minutes are between 59 - 30
		print: middle of the game is going great

	- when the minutes are between 29 - 0
		print: the end of the same is approaching
*/
package day14_nested_if_statements;

import java.util.Scanner;

public class SoccerGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter How many minutes left in the game:");
        int minutes = scan.nextInt();
        String message;

        if (minutes >= 0 && minutes <= 90) {

            if (minutes >= 75 && minutes <= 90) {
                message = "just getting started";
            } else if (minutes >= 60 && minutes <= 74) {
                message = " players are doing their best";
            } else if (minutes >= 30 && minutes <= 59) {
                message = "middle of the game is going great";
            } else {
                message = "the end of the same is approaching";
            }

        } else { if (minutes < 0) {
                message = "minutes cannot be a negative number";
            } else {
                message = "games cannot be longer than 90 minutes";
            }
        }
        System.out.println(message);
    }}
