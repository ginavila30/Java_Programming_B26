package day07_unaryoperators;

public class IncrementExample {
    public static void main(String[] args) {

        // Incrementing example
        int x=0;
        System.out.println(x);//0

        x=x+1; // This line and 13 and 16 are the same, but 13 and 16 are the shortcuts.
        System.out.println(x);//1

        x++; // reassigning value to x with unary operator(shortcut) (Post Increment)
        System.out.println(x);//2

        ++x;
        System.out.println(x);//3 reassigning value to x with pre increment.

        //Difference between pre and post increment.

        System.out.println(++x); // because it is pre increment it will add right away. 4

        System.out.println(x++); // statement is run 1st because it is a post increment 4

        System.out.println(x);
    }
}
