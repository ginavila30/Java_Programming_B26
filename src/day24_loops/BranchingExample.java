package day24_loops;

public class BranchingExample {
    public static void main(String[] args) {

        for (int i = 0; i <=10 ; i++) {

            System.out.print(i+" ");

        }

        System.out.println();
        for (int i = 0; i <=10 ; i++) {

            System.out.print(i+" ");
        break;}

        System.out.println();
        for (int i = 0; i <=10 ; i++) {

            System.out.print(i+" ");


            if(i==5){break;// my loop will end here and won't go to the updating part(i++). Break is not recommended, but it is important to know it. It is a way to exit the loop.
            }
    }
        System.out.println();
        for (int i = 0; i <=10 ; i++) {

            if(i==5){continue;}

            System.out.print(i+" ");// This won't be printed whenever the if is true (when i is ) because  continue; skips the statements after it and immediately goes to the update.

        }

        System.out.println();
        for (int i = 0; i <=100 ; i++) {

            if(i%2==1){continue;}// this won't print any odd numbers because continue; skips the print statement below and goes straight to update.

            System.out.print(i+" ");}

    }}
