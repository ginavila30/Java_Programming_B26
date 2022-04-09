package day14_03_30_2022;

import java.util.Arrays;

public class SumpUpToZero {
    public static int[]sumUpToZero(int n) {

        int[] arr = new int[n];
        if (n > 0 && n < 100) {
            if (arr.length % 2 == 0) {

                for (int i = 0, negative = -n; i < arr.length / 2; i++) {
                    arr[i] = negative++;
                }
                for (int i = arr.length / 2, positive = n; i < arr.length; i++) {
                    arr[i] = positive--;

                }
            }else{ arr[arr.length/2]=0;
                for (int i = 0, negative = -n; i < arr.length / 2; i++) {
                    arr[i] = negative++;
                }
                for (int i = (arr.length / 2)+1, positive = n; i < arr.length; i++) {
                    arr[i] = positive--;
            }

        }

    }else{ return null;}

        return arr;
    }

    /*Mehmet option

    public static int[] sumUpToZero(int N){

        int[] arr=new int[N];
        int sum=0;

        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=i;
            sum+=i;
        }

        arr[arr.length-1]=-sum;

        return arr;*/

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumUpToZero(1)));
}}
