package day13_if_statements;

public class IfWithoutBrackets {
    public static void main(String[] args) {
        if (4>2)
            System.out.println("hello");
        if (4>10)
            System.out.println("bye");
        System.out.println("Otherline");// This is not related to the If; its a separate print statement. This happens because when no using brackets the if statement only runs o executes the line after it.
    }
}
