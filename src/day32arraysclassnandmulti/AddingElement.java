package day32arraysclassnandmulti;

import java.util.Arrays;
import java.util.Scanner;

public class AddingElement {
    public static void main(String[] args) {
        /* *Have a starting Array.
           * Add a number to the end.
           * Make array bigger to store new number.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number do you want to include?"); // scanner to determine the size of the array.
        int size=scan.nextInt();

        int[]arr=new int[size];
        for (int i = 0; i <size ; i++) { // loop to enter values to each index of the array.
            System.out.println("Enter number:");
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[]arr2= Arrays.copyOf(arr,arr.length+1);// copying arr to arr2. Creating a new object, so I can manipulate arr 2 without altering arr. Also, I did plus 1 to add one more number to arr 2. But this does not change regular arr.
        System.out.println("Enter last value");
        arr2[arr2.length-1]= scan.nextInt();// assigning value to the additional element of arr2.
        System.out.println(Arrays.toString(arr2));
    }
}
