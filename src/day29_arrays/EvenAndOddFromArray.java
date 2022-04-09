package day29_arrays;

import java.util.Scanner;

public class EvenAndOddFromArray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many numbers are you checking");
        int size = scan.nextInt();
        int even = 0;
        int odd =0;
        String evenNums="";
        String oddNums="";
        int [] numbers = new int[size];

        for (int i =0; i<size; i++){
            System.out.println("Enter a Number");
            numbers [i]= scan.nextInt();

            if(numbers[i]%2==0){
                even++;
                evenNums+=numbers[i]+" ";
            }else{odd++;
                oddNums+=numbers[i]+" ";}

        }
        System.out.println("Total Even: "+even+" They are: "+evenNums+"\nTotal Odd: "+odd+" They are: "+oddNums); // we are printing ow many are even and how many are odd, and we are printing which numbers belong to each group.

        System.out.println();

        // for each loop version using the Array created above.
        int evenCount=0;
        int oddCount=0;
        for (int eachNum:numbers){
            if(eachNum%2==0){evenCount++;}else {oddCount++;}
        }
        System.out.println("Even: "+evenCount+"\nOdd: "+oddCount);
    }
}
