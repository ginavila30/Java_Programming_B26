package day24_loops;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter something");
        String str = input.nextLine().trim().toLowerCase();

        String newStr = "";



        for (int i = 0; i< str.length(); i++){


            if (str.charAt(i) == ' '){
                newStr += (""+str.charAt(i+1)).toUpperCase();
                i++;
            }else{newStr += str.charAt(i);}
        }
        System.out.println(newStr.replace(" ",""));
    }
}