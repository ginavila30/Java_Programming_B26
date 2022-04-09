package day08_03_09_2022;

import java.util.Scanner;

public class UniqueChars2ndApproach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input:");
        String input = scan.nextLine();

        for (int i=0; i<input.length();i++){
            char each= input.charAt(i);
            boolean unique = input.indexOf(each)==input.lastIndexOf(each); //compare position(index) of the first occurrence of the char and the last occurrence of the char. If they give the same number that means that the char is only present 1 time in the string, and it is unique.
            if (unique){
                System.out.println(each);
            }
        }
    }
}
