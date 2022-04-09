package day26_nestedloops;
// note: inner loop is completed and then in goes to next outer loop iteration

public class NestedExample2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print("A");
            for (int j = 0; j < i; j++) {
                System.out.print("B");
            }
            System.out.println();

        }
        System.out.println("example with String");
        String str="java";

        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j <=i ; j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();

        }
    }

}
