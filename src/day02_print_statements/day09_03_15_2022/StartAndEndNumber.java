package day02_print_statements.day09_03_15_2022;

import java.util.Arrays;
import java.util.Scanner;

public class StartAndEndNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System. in);
        System.out.println("Enter start and end numbers:");
        int start= scan.nextInt();
        int end = scan.nextInt();
        int [] numbers=new int[end-start];

        for (int i= start, j=0; i<end; i++, j++){
            numbers[j]=i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}

