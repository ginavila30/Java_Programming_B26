package day34_return_methods;

import java.util.Scanner;

public class NumberWords {
    public static String numberAsWord(int num){

        if(num<1||num>10){return num+" Invalid num";} // if data is invalid this return runs and then method ends, which means it doe not check anything else.
        String[]words={"one","two","three","four","five","six","seven","eight","nine","ten"};
        return words[num-1];
    }

    public static void main(String[] args) {
        System.out.println( numberAsWord(5));
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(numberAsWord(scan.nextInt()));// using scanner to give the argument of my method.
    }
}
