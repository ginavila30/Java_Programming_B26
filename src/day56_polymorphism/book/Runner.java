package day56_polymorphism.book;
/*Create a runner class Library

    create objects of the JavaTextbook with all possible references and try to access all the variables and methods with each reference*/
public class Runner {
    public static void main(String[] args) {
        Book book1=new JavaTextBook();
        book1.name="Java Text Book";
        book1.read();

        Downloadable book2=new JavaTextBook();
        book2.download();
        JavaTextBook javaBook2=(JavaTextBook)book2;// Downcasting, book2 was the interface reference, we cast reference to be Java textbook, and assign it to book file reference.

        E_Book book3=new JavaTextBook();
        ((JavaTextBook)book3).isFun=true;//downcasting EBOOK to JavaTextBook
        JavaTextBook javaTextBook=(JavaTextBook)book3;// dwncasting the entire object.

        book3.size=20;
        book3.download();
        book3.open();
        book3.read();

        JavaTextBook book4= new JavaTextBook();
        book4.name="Java Text Book Beginners";
        book4.size=50;
        book4.download();
        book4.open();
        book4.read();
        book4.isFun=true;




    }
}
