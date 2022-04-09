package day03_comments_escape_sequence;

public class Quotes_BackSlash {
    public static void main(String[] args) {

        System.out.println("I like \"Java\" programming");
        System.out.println("\"This is a quote\"");
        /* Backslash follow by quotation is to input quotes in the console
        First quote is to enter text in the console, the second quote is to enter quotation symbol in to the console*/

        //To print a backslash
        System.out.println("abc \\ def");
        // The first backslash is for the syntax escape character, the second backslash is for the character output in the console
        // Every escape character begins with \

        System.out.println("abc \\\" def"); // This is an example that merges both.
        System.out.println("abc/def");// Forward slash can be entered for printing as a regular character, no need to use escape character
    }
}
