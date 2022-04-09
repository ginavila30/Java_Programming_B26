package day26_nestedloops;

public class Triangle {
    public static void main(String[] args) {


        for (int i = 0; i <10 ; i++) {
            System.out.print("       ");

            for (int j = 0; j <i ; j++) {

                System.out.print("* ");;

            }
            System.out.println("");// I need this space so that the full result of my inner loop is printed in a separate lane everytime it is repeated based on the outer loop.

            
        }
    }
}
