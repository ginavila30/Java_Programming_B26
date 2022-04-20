package day49_inheritance.Book;

public class AllBooks {
    public static void main(String[] args) {
        Book book1=new Book();
        book1.title="Me after you";
        book1.author="Elizabeth R";
        book1.chapter=1;
        book1.genre="Romantic";
        book1.price=2.50;
        book1.hasAMovie=true;

        AudioBook audioBook1=new AudioBook();
        audioBook1.title="los 7 elementos";
        audioBook1.author="Jaime R";
        audioBook1.chapter=2;
        audioBook1.genre="Personal growth";
        audioBook1.price=3.50;
        audioBook1.hasAMovie=false;
        audioBook1.narrator="Gina S";
        audioBook1.duration=3.5;
        audioBook1.listen();

        E_Book e_book1=new E_Book();
        e_book1.title="Galaxy";
        e_book1.author="Walter R";
        e_book1.chapter=5;
        e_book1.genre="Science";
        e_book1.price=15;
        e_book1.hasAMovie=false;
        e_book1.pages=120;
        e_book1.size="large";
        e_book1.read();
    }
}
