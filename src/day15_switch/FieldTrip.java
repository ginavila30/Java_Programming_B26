package day15_switch;

/*Create a class called FieldTrip.
Your school goes on a Field trip each year. The place you go will be based on your grade. Based on the grade level (1-6) figure out the details of your field trip. Print the information at the end.

declare and assign the grade level variable

	only check for the data for valid grades which are only grades values from 1-6. Less than 1 and more than 6 is invalid,
		so print: "Grade must be between 1-6"

    Data based on grade:
        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt*/
import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your grade:");
        int grade= scan.nextInt();
        String location, teacher, message;
        int groups;

        if (grade>=1&&grade<=6){ if(grade==1){
            grade=1;
            location="Apple orchard";
            groups=3;
            teacher="Ms. Smith";

        }else if(grade==2){ grade=2;
            location="Zoo";
            groups=7;
            teacher="Mr. Lee";
        }else if(grade==3){ grade=3;
            location="Aquarium";
            groups=5;
            teacher="Ms. Wilson";
        }else if(grade==4){ grade=4;
            location="Movie Theater";
            groups=2;
            teacher="Ms. Reyes";
        }else if(grade==5){ grade=5;
            location="Museum";
            groups=5;
            teacher="Ms. Lela";
        }else{ grade=6;
            location="Six Flags";
            groups=8;
            teacher="Mr. Watt";}

            message="Grade - "+grade+"\nLocation - "+location+"\nGroups - "+groups+"\nTeaher - "+teacher;
            System.out.println(message);

        }else{
            System.out.println("Grade must be between 1-6");

    }

}}
