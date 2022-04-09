package day23_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String sentence = scan.nextLine().trim();
int count=0;
        for (int i =0;i<=sentence.length()-1;i++){

            if(sentence.charAt(i)==' '){
                count+=1;
            }
        }
        System.out.println("Number of words: "+(count+1));

}}
