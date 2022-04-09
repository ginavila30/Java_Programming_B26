package day10_03_16_2022;

import java.util.Arrays;

public class RotateLeft { public static void main(String[] args) {
    int[]arr={17,12,10,8,9};
    int[]rotated= new int[arr.length];
    rotated[rotated.length-1]=arr[0];

    for (int i=0 ; i< arr.length-1;i++){
        rotated[i]=arr[i+1];
    }
    System.out.println(Arrays.toString(rotated));


    System.out.println("Different Approach done by Mehmet");

    int[] x={1,2,3,4,5};    // => [2,3,4,5,1]


        /*
        int temp=x[0];    --> 1

        i=0  --> x[0]=x[1]   --> 2,2,3,4,5
        i=1  --> x[1]=x[2]   --> 2,3,3,4,5
        i=2  --> x[2]=x[3]   --> 2,3,4,4,5
        i=3  --> x[3]=x[4]   --> 2,3,4,5,5

        x[x.length-1]=temp;  --> 2,3,4,5,1

        Formula
            x[i]=x[i+1];


         */
    int temp=x[0];   // 1

    for (int i = 0; i < x.length-1; i++) {
        x[i]=x[i+1] ;
    }
    x[x.length-1]=temp;

    System.out.println(Arrays.toString(x));

    System.out.println("Rotated right");

    int[] x2={1,2,3,4,5};
    int[]rotatedRight=new int [x2.length];
    rotatedRight[0]=x2[x2.length-1];

    for (int i = 0, j=1; i < x2.length-1 ; i++,j++) { // I use -1  beause I already tok care of 1 element in each array.

        rotatedRight[j]=x2[i];

    }
    System.out.println(Arrays.toString(rotatedRight));





}
}