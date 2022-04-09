package day04_02_23_2022;

import java.util.Scanner;

public class BrowserTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the browser name:");
        String browserName = scan.nextLine();
        System.out.println("Enter the operating system:");
        String operatingSystem = scan.nextLine();
        System.out.println("Is the browser opened? respond true or false");
        boolean isBrowserOpened = scan.nextBoolean();

        String message="";

        if (isBrowserOpened==false) {

            switch (operatingSystem){

                case"mac": if(browserName.equals("chrome")|| browserName.equals("chrome-headless")||browserName.equals("firefox-headless")||browserName.equals("firefox")||browserName.equals("safari")||browserName.equals("remote-chrome")){message="Browser is opened successfully with"+browserName+" in "+ operatingSystem;} else{ message="Your "+operatingSystem+" doesn't support "+ browserName;}break;

                case"windows":if(browserName.equals("chrome")|| browserName.equals("chrome-headless")||browserName.equals("firefox-headless")||browserName.equals("firefox")||browserName.equals("edge")||browserName.equals("remote-chrome")||browserName.equals("ie")){message="Browser is opened successfully with "+browserName+" in"+ operatingSystem;}else{ message="Your "+operatingSystem+" doesn't support "+ browserName;}
                    break;
            }

            }else{ message="Browser is already opened with "+browserName+ " in "+ operatingSystem;}

        System.out.println(message);

        }
        }
