package day13_03_28_2022;

import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password");
        String password= scan.nextLine();
        if(password.length()>=8&&!password.contains(" ")){
            boolean upperCaseCond= false;
            boolean lowerCaseCond= false;
            boolean digitCond= false;
            boolean specialCond= false;
            for (int i = 0; i <password.length() ; i++) {
                if(Character.isUpperCase(password.charAt(i))){
                    upperCaseCond=true; continue;
                }else if(Character.isLowerCase(password.charAt(i))){
                    lowerCaseCond=true; continue;
                }else if(Character.isDigit(password.charAt(i))){
                    digitCond=true;
                }else if(password.charAt(i)>=33&&password.charAt(i)<=47||password.charAt(i)>=58&&password.charAt(i)<=64||password.charAt(i)>=91&&password.charAt(i)<=96||password.charAt(i)>=123&&password.charAt(i)<=127){
                    specialCond=true;
                }
            }
            if (upperCaseCond&&lowerCaseCond&&digitCond&&specialCond){
                System.out.println("Valid Password");
            }else {
                System.out.println("Invalid Password");
            }
        }else{
            System.out.println("Invalid Password");

        }
    }
}
