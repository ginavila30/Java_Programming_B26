package day24_loops;

import javax.sound.midi.spi.SoundbankReader;
import java.util.Scanner;

public class SpaceProgram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the input:");
        String input= scan.nextLine().trim();
        input=input.replaceAll(" ","_");

       String newStr="";
       for (int i = 0; i <input.length() ; i++) {

          newStr+=input.charAt(i)+" ";
       }
        System.out.println(newStr.trim());



    }
}
