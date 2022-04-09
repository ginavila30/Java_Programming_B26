package day29_arrays;

import java.util.Scanner;

public class GradeBook {public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("How many students?");
    int size= scan.nextInt();
    String[]names= new String[size];
    int [] scores= new int[size];
    char[] grade= new char[size];

    for (int i = 0; i < size ; i++) {
        System.out.println("Enter name "+(i+1));
        scan.nextLine();
        names[i]= scan.nextLine();
        System.out.println("Enter score "+(i+1));
        scores[i]= scan.nextInt();
        if(scores[i]>=85){
            grade[i]='A';
        }else if (scores[i]>=75){
            grade[i]='B';
        }else if (scores[i]>=65){
            grade[i]='C';} else{ grade[i]='D';}

    }

    for (int i = 0; i < size ; i++) {
        System.out.println(names[i]+"|"+scores[i]+"|"+grade[i]);
    }

}
}