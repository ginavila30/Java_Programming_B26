package day27_nested_loops;

public class BreakInNested {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i "+i);

            //if(i==3){break;} --> in that case the outer loop stops when i==3.

            for (int j = 0; j <2 ; j++) {

                System.out.println("j "+j);
                //break; outer loop will run from 0 to 5 but the inner loop will only run 1 iteration because the break exits the inner loop.

            }
            System.out.println();
          //  break; Adding break here will stop outer loop after first iteration.
        }
    }
}
