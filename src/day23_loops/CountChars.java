package day23_loops;

import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your input:");
        String UserInput=scan.nextLine();
        int upperCase=0;
        String upper="";
        int lowerCase=0;
        String lower="";
        int numbers=0;
        String num ="";
        for (int i=0;i<UserInput.length();i++){

            char characterToCheck=UserInput.charAt(i);

            if(characterToCheck>='A'&&characterToCheck<='Z'){upperCase++; upper+=characterToCheck+" ";}
            else if(characterToCheck>='a'&&characterToCheck<='z'){lowerCase++; lower+=characterToCheck+" ";}
            else if (characterToCheck>='0'&&characterToCheck<='9'){numbers++; num+=characterToCheck+" ";}

        }

        System.out.println("Uppercase letters: "+upperCase+"\n"+upper+"\nLowercase letters  "+lowerCase+"\n"+lower+"\nnumbers: "+numbers+"\n"+num);


    }
}
