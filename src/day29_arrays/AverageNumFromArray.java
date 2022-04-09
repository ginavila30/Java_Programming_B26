package day29_arrays;

import java.util.Scanner;
// Calculate the average number
public class AverageNumFromArray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many number do you want to include?");
        int num= scan.nextInt();
        int total=0;

        int[] numbers= new int[num];
// Scanner approach with for loop
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Enter a number");
            numbers[i]=scan.nextInt();
            total+=numbers[i];
        }
        System.out.println("The average number is: "+ (total/num));

        System.out.println();
        //Hardcoded version with for each loop

        int[]nums={10,15,5,6};
        int sum=0;
        for (int eachNum:nums){
            sum+=eachNum;
        }
        System.out.println("The average number is: "+ (sum/ nums.length));
    }
}
