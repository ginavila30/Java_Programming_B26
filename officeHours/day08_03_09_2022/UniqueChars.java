package day08_03_09_2022;

import java.util.Scanner;

public class UniqueChars {  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter input");
    String input=scan.nextLine().trim();
    String result="";

    for (int i = 0; i < input.length(); i++) {
        int letterIndex=i;//A
        int count =0;
        for (int j = 0; j < input.length() ; j++) {

            if (input.charAt(i)==input.charAt(j)){
                count++;
            }

        }
        if (count==1){
            result+=input.charAt(i)+", ";
        }

    }
    System.out.println(result);
    System.out.println("The first unique character is: "+result.charAt(0));

}
}