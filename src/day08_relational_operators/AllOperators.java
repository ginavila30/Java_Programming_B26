package day08_relational_operators;

public class AllOperators {
    public static void main(String[] args) {
        System.out.println(5+2*3);// Multiplication is first, then the addition.

        System.out.println(5*2+4/2); // first multiplication, then the division, last the addition.

        System.out.println(5+2>4-3);

        int a=20;
        int b = -a-- + a++ + --a * a--; // after this a value is 18
        //      -20  + 19  + 19 * 19

        System.out.println(b);

    }
}
