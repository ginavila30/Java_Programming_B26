package testing_or_explanations;

import java.util.Arrays;
import java.util.Scanner;

public class ZoombieTask {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        int[] inhabitants = {3,6,0,4,3,2,7,0};


        //TODO. Write your code below this line.
        int[] inhabitantsCopy= Arrays.copyOf(inhabitants,inhabitants.length);
        int[]arr={0,0,0,0,0,0,0,0};
        int day=0;
        do {
            System.out.println("Day "+ day++ + Arrays.toString(inhabitants));

            for (int i = 0; i <inhabitants.length ; i++) {
                if(i!=inhabitants.length-1 && i!=0){
                    if(inhabitants[i]==0){inhabitantsCopy[i-1]=inhabitants[i-1]/2;inhabitantsCopy[i+1]=inhabitants[i+1]/2;}}
                else{
                    if(i==inhabitants.length-1 ){
                        if(inhabitants[i]==0){inhabitantsCopy[i-1]=inhabitants[i-1]/2;}
                    }else{if(inhabitants[i]==0){inhabitantsCopy[i+1]=inhabitants[i+1]/2;;}}}
            }

            inhabitants=Arrays.copyOf(inhabitantsCopy, inhabitantsCopy.length);

        }while (!Arrays.equals(inhabitants,arr));
        System.out.println("Day "+ day++ + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");

    }
}
