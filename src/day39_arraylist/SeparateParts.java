package day39_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class SeparateParts {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the sentence to be checked");
        String str= scan.nextLine();
        ArrayList<Character> letters=new ArrayList<>();
        ArrayList<Character>digits=new ArrayList<>();
        ArrayList<Character>specialChars=new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isLowerCase(str.charAt(i))||Character.isUpperCase(str.charAt(i))){
                letters.add(str.charAt(i));
            }else if(Character.isDigit(str.charAt(i))){
                digits.add(str.charAt(i));
            }else{
                specialChars.add(str.charAt(i));
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);
    }
}
