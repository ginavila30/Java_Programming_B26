package day21_loops;

import java.util.Scanner;

public class Adding5Num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfIteration=1;// separate variable for the number of times I want my code to run.
        int sum =0;

        while(numberOfIteration<=5){
            System.out.println("Enter Number "+numberOfIteration);
            numberOfIteration++;
            sum+=scan.nextInt();

        }
        System.out.println(sum);

        }
    }

