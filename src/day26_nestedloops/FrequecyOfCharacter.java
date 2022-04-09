package day26_nestedloops;
/*

        String apple

        count how many times each letter is in the String

        a - 1
        p - 2
        l - 1
        e - 1

        what we will try to do:

            we will go one character at a time

            charAt(0) --> a

                apple
                    a == a
                    a == p
                    a == p
                    a == l
                    a == e

             charAt(1) --> p

                 apple

                    p == a
                    p == p
                    p == p
                    p == l
                    p == e

     */

import java.util.Scanner;

public class FrequecyOfCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input");
        String input = scan.nextLine().trim().toLowerCase();
        String checked="";

        for (int i = 0; i < input.length(); i++) {
            int count = 0; // everytime the outer loop itertes counter will be reset to 0.
            char letter = input.charAt(i);
            if(checked.contains(""+letter)){continue;}

            for (int j = 0; j < input.length(); j++) {

                char eachLetter = input.charAt(j);
                if (letter == eachLetter) {
                    count++;
                }

            }
            System.out.println(""+input.charAt(i)+"="+count);
            checked+=letter;

        }

    }
}
/*


        String s = "appleee";
        String checked = ""; // aple

        for(int i = 0; i < s.length(); i++){

            int count = 0;  // everytime the outer loop iterates, the counter is set back to 0. It is reset between every character
            char letter = s.charAt(i);

            if(!checked.contains("" + letter)){

                for(int j = 0; j < s.length(); j++){

                    char eachLetter = s.charAt(j);

                    if(letter == eachLetter)  { // s.charAt(i) == s.charAt(j)
                        count++;
                    }

                } // end of the inner loop

                System.out.println(letter + " - " + count);
                checked += letter;
            }

        }
 */
