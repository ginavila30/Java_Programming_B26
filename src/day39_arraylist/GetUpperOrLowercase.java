package day39_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class GetUpperOrLowercase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the sentence to be checked");
        String str= scan.nextLine();
        ArrayList<Character>upperCase=new ArrayList<>();
        ArrayList<Character>lowerCase=new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isUpperCase(str.charAt(i))){
                upperCase.add(str.charAt(i));
            }else if(Character.isLowerCase(str.charAt(i))){
                lowerCase.add(str.charAt(i));
            }
        }
        System.out.println(upperCase);
        System.out.println(lowerCase);
    }

}
