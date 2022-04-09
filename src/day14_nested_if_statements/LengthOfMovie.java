/*The length of the movie will determine how much it costs.
declare and assign a variable for the duration of the movie
The length will be given as a decimal as hours.minutes

	duration of less than or equal to 0:
		Movies cannot be less than 0 minutes
	duration of more than 4:
		Movies cannot be more than 4 hours

	for all other duration uses the following values to display the price of the tickets

		duration 	--> price
		1.0 		--> 8.99
		1.5 		--> 10.50
		2.0 		--> 12.99
		2.5 		--> 14.50
		3, 3.5 or 4 --> 15.99
*/
package day14_nested_if_statements;

import java.util.Scanner;

public class LengthOfMovie {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the duration of the movie");
        double duration= scan.nextDouble();
        String message;


        if (duration>0&&duration<4.0){
            if(duration>0&&duration<=1.0){message="$8.99";}
            else if(duration==1.5){message="$10.50";}
            else if(duration==2.0){message="$12.99";}
            else if(duration==2.5){message="$14.50";}
            else if(duration==3|| duration==3.5|| duration==4){message="$15.99";}
            else{message="Price not available";}

        }else{if(duration<=0){message="Movies cannot be less than 0 minutes";}
            else{message="Movies cannot be more than 4 hours";}
        }
        System.out.println(message);

    }
}
