package day03_04_18_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        /*-Create a class named Library
        -create Book objects
        -find the number off all books in the
        library with the help of "static" feature
        -create allBooks arrayList
        -create fantasyBooks arraylist by using allBooks collection
*/
        Book book1=new Book("ABC");
        Book book2=new Book("The numbers","kids");
        Book book3=new Book("Dragons","fantasy","James R");

        System.out.println(Book.bookCount); // each constructor increases objects.



        ArrayList<Book>allBooks=new ArrayList<>(Arrays.asList(book1,book2,book3));
        System.out.println(allBooks);
        ArrayList<Book>fantasyBooks=new ArrayList<>(allBooks);
        fantasyBooks.removeIf(each->each.category==null||!each.category.equalsIgnoreCase("fantasy"));
        System.out.println(fantasyBooks);
    }
}
