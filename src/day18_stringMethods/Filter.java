package day18_stringMethods;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String message= scan.nextLine();//scan.nextLine().toLowerCase().trim(); (this is how I chain multiple methods at the same time.
        message=message.toLowerCase();
        message=message.trim();
        boolean validMessage= message.contains("java is bad")||message.contains("quit")||message.contains("have fun")||message.contains("crying");
        if(validMessage){
            System.out.println("Message failed to send");
        }else{
            System.out.println("\""+ message +"\" sent");
        }
    }
}
