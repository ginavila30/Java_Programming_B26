package day37_wrapperclass;

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password");
        String password= scan.nextLine();
        if(password.length()>=8){
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
            }else if(password.charAt(i)=='!'||password.charAt(i)=='@'||password.charAt(i)=='#'||password.charAt(i)=='$'||password.charAt(i)=='%'||password.charAt(i)=='^'||password.charAt(i)=='&'||password.charAt(i)=='*'){
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
