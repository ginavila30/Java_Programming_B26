package day08_03_09_2022;

import java.util.Scanner;

public class sumOfDigits {public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    String input = scan.nextLine();
    int output=0;

    for (int i = 0; i < input.length() ; i++) {

        if (input.charAt(i)>='0'&& input.charAt(i)<='9'){output+=input.charAt(i)-48;}
    }
    System.out.println(output);



}}