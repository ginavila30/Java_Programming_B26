package day26_nestedloops;

public class Multiplication {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {// outer loop
            System.out.println("Multiplication table for "+i);
            for (int j = 1; j <= 10; j++) {//inner loop
                int total = i*j;
                System.out.print(""+i+"x"+j+"="+total+"|");

            }
            System.out.println();

        }
    }
}
