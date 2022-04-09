package day15_switch;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a day:");
        String day = scan.nextLine();

        String instructor="", className="", schedule="";


        switch (day) {
            case "monday":
            case "Monday":
            case "mon":
            case "tuesday":
            case "Tuesday":
            case "tue":
            case "Wednesday":
            case "wednesday":
            case "wed":
                instructor = "Saim";
                className = "Java Programming";
                schedule = "7pm to 10pm";
                break;


            case "Thursday": case "thursday": case "thu":
                instructor = "Nadir";
                className = "Soft Skills";
                schedule = "7pm to 10pm";
                break;

            case "Friday":
            case"friday":
            case"fri":
                instructor = "no class";
                className = "no class";
                schedule = "no class";
                break;

            case "Saturday":
            case "saturday":
            case "sat":
            case "Sunday":
            case "sunday":
            case "sun":
                instructor = "saim";
                className = "Java Programming";
                schedule = "10am to 5pm";
                break;

        default:
                System.out.println("not a day");
        } System.out.println("Class Information:"+"\nInstructor->"+instructor+"\nClass name->"+className+"\nSchedule->"+schedule);}}





