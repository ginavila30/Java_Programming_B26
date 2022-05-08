package day55_polymorphism.book;
/*Create an abstract class EBook
    - Inherits Book and implements Downloadable
    - Declare a size variable
    - Declare an abstract methods:
        open()*/
public abstract class E_Book extends Book implements Downloadable {
    public int size;
    public abstract void open();
}
