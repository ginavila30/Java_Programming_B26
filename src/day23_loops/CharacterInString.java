package day23_loops;

import java.util.Scanner;

public class CharacterInString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String message= scan.nextLine();

        for (int i=0;i<message.length();i++){


            System.out.print((int)message.charAt(i)+" ");
        }
    }
}
