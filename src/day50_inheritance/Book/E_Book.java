package day50_inheritance.Book;

public class E_Book extends Book{
    public  double size;
    public  int pages;
    public void read(){
        System.out.println("Reading a digital copy of "+title);
    }
}
