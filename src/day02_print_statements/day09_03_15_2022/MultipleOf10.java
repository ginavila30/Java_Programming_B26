package day02_print_statements.day09_03_15_2022;

import java.util.Arrays;

public class MultipleOf10 {public static void main(String[] args) {
    int[] newArray = {5, 4, 40, 1, 60, 2, 30, 34, 70, 43, 2,80,67};
    int temp=0;
    boolean modify=false;

    for (int i = 0; i < newArray.length ; i++) {

        if(newArray[i]%10==0){
            temp=newArray[i];
            modify=true;
        }else if(newArray[i]%10!=0&&modify){
            newArray[i]=temp;
        }
    }
    System.out.println(Arrays.toString(newArray));
}}