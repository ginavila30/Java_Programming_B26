package day27_nested_loops;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter input");
        String input=scan.nextLine().trim().toLowerCase();// aabccd
        String result="";

        for (int i = 0; i < input.length(); i++) {

            int count =0;
            for (int j = 0; j < input.length() ; j++) {

                if (input.charAt(i)==input.charAt(j)){
                    count++;
                }

            }
            if (count==1){ // if it is ==1 it means the char appear only 1 time, more than 1 it means it appeared more than 1 time therefore is not unique, so I don't print it.
                result+=input.charAt(i)+", ";
            }

        }
        System.out.println(result);
        System.out.println("The first unique character is: "+result.charAt(0));

    }
}
