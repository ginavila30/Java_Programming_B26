package day20_stringmethods3;

import java.util.Scanner;

public class SMSParts {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the information:");
        String info= scan.nextLine();
        int senderStart=(info.indexOf("<")+1);//J
        int senderEnd=(info.indexOf(">"));//D
        int numberStart=(info.indexOf("[")+1);
        int numberEnd=(info.indexOf("]"));
        int messageStart=(info.indexOf("{")+1);
        int messageEnd=(info.indexOf("}"));


        String sender=info.substring(senderStart,senderEnd);
        System.out.println("sender : " + sender);

        String number=info.substring(numberStart,numberEnd);
        System.out.println("number : " + number);

        String message=info.substring(messageStart,messageEnd);
        System.out.println("message : " + message);


    }
}
