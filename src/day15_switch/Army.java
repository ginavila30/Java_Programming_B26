package day15_switch;
/*Declare and assign these variables: Citizenship(boolean), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the person is qualified to join the army.

	- The person must be a citizen or a resident
		-> If not print: You must be a citizen or a resident
	- Their age must be between 18 and 35
		-> If not print: Your age must be between 18 to 35 years old
	- They must have a high school diploma
		-> If not print: You must have a high school diploma

	> If all the criteria is met print: You are qualified for the Army
*/
import java.util.Scanner;

public class Army {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you a citizen");
        boolean citizen = scan.nextBoolean();
        System.out.println("Are you a resident");
        boolean resident = scan.nextBoolean();
        System.out.println("Do you have a High School Diploma");
        boolean highSchool = scan.nextBoolean();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        boolean firstCondition = citizen == true || resident == true;
        boolean secondCondition = age >= 18 && age <= 35;
        boolean thirdCondition = highSchool == true;
        String message;


        if (firstCondition && secondCondition && thirdCondition) {
            message = "You qualify for the Army";
            System.out.println(message);
        } else {
            if (!firstCondition) {
                message = "You must be resident or citizen";
                System.out.println(message);
            }
            if (!secondCondition) {
                message = "Your age must be between 18 to 35 years old";
                System.out.println(message);
            }
            if (!thirdCondition) {
                message = "You must have a High School Diploma";
                System.out.println(message);
            }
        }
    }}