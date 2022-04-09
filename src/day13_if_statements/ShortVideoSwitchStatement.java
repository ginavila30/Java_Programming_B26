package day13_if_statements;

public class ShortVideoSwitchStatement {
    public static void main(String[] args) {
        int number=9;
        // Print name of the day
        switch(number){
            case 1:
                System.out.println("Monday");
                break;// This is to terminate the code block
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid number");
        }
    }
}