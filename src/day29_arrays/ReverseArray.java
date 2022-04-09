package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many numbers will you store?");
        int size= scan.nextInt();
        int [] numbers= new int[size];

        for (int i = 0; i < numbers.length ; i++) {

            System.out.println("Enter a number");
            numbers[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

       // int [] numbers ={1,2,3,4,5}; Thi is hardcoded version. And above it is dynamic version to create the original array.

        // below loop to reverse the array.
        int element= 0;
        int [] reversed= new int[numbers.length]; // Instead of using element variable I could do , for (int i=numbers.length; j=0; i>=0; i--, j++) j will determine the position where the value will be stored in the reversed array.
        for (int j=numbers.length-1; j>=0; j--){
            reversed[j]=numbers[element++];
        }
        System.out.println(Arrays.toString(reversed));
    }
}
