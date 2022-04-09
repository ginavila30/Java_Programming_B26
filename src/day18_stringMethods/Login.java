package day18_stringMethods;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter username:");
        String username= scan.nextLine();
        username=username.toLowerCase();
        System.out.println("Enter password");
        String password= scan.nextLine();
        String message="";

        if(password.length()>8&&password.equals("jamesbond")){
                message="logged in with "+ username;}else{message="invalid password";}
        System.out.println(message);
    }

}
