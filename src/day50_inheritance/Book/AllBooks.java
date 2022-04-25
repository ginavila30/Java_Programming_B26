package day50_inheritance.Book;

public class AllBooks {
    public static void main(String[] args) {
        Book book1=new Book();
        book1.title="Me after you";
        book1.author=new Author("Jk R",40);// Made an Author object. it belongs to the Book book1 object.
        System.out.println(book1.author);
        System.out.println(book1.author.getName());
        System.out.println(book1.author.getAge());
        book1.chapter=1;
        book1.genre="Romantic";
        book1.price=2.50;
        book1.hasAMovie=true;


        AudioBook audioBook1=new AudioBook();
        audioBook1.title="los 7 elementos";
        audioBook1.author= new Author("Jaime R",35);// same as line 7
        audioBook1.chapter=2;
        audioBook1.genre="Personal growth";
        audioBook1.price=3.50;
        audioBook1.hasAMovie=false;
        audioBook1.narrator="Gina S";
        audioBook1.duration=3.5;
        audioBook1.listen();
        AudioBook.editor="Gina";// example of static inheritance. vx was declared in Book as a static Audio book inherited Book. So the static vx was inherited.



        E_Book e_book1=new E_Book();
        e_book1.title="Galaxy";
        e_book1.author=new Author("James",50);// same as line 7
        e_book1.chapter=5;
        e_book1.genre="Science";
        e_book1.price=15;
        e_book1.hasAMovie=false;
        e_book1.pages=120;
        e_book1.size=25;
        e_book1.read();
    }
}
