package day15_switch;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the browser:");
        String browser= scan.nextLine();
        System.out.println("Enter the url:");
        String url= scan.nextLine();

        switch (browser){
            case "chrome":// I am entering this extra case without any statement ot break so to avoid case sensitivity. if th person writes it lower case the java will run everything from this case up to a break or end of statement. basically that is the way to say or||
            case "Chrome":
                System.out.println("Opening "+url+" in chrome");
                System.out.println("Loading...");break;
            case "safari":
                System.out.println("Opening "+url+" in safari");
                System.out.println("Loading...");break;
            case "firefox":
                System.out.println("Opening "+url+" in firefox");
                System.out.println("Loading...");break;
            default:
                System.out.println(browser+"->Invalid browser");
        }

    }
}
