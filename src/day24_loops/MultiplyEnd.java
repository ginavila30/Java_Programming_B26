package day24_loops;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Words: ");// hello?
        String words= scan.nextLine();
        System.out.println("Enter the number: ");//3
        int repeat= scan.nextInt();


        for (int i = 0; i <repeat ; i++) {

            words+=words.charAt(words.length()-1);
        }
        System.out.println(words);

    }

}
