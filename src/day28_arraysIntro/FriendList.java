package day28_arraysIntro;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many friends do you have?");
        int numOfFriends= scan.nextInt();
        scan.nextLine();

        String [] friends= new String[numOfFriends];
        for (int i=0; i<numOfFriends;i++){

            System.out.println("Enter the name of your friend "+i+1);
            friends[i]= scan.nextLine();
        }
        System.out.println(Arrays.toString(friends));
    }
}


