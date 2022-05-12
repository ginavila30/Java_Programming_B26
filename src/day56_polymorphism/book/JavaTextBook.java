package day56_polymorphism.book;
/*Create a concrete class JavaTextbook
    - Inherits EBook
    - Declare a fun variable
    - Override all abstract methods
*/
public class JavaTextBook extends E_Book {
    @Override
    public void open() {
        System.out.println("Opening Java Text Book");
    }

    @Override
    public void read() {
        System.out.println("Reading Java Text Book");
    }

    @Override
    public void download() {
        System.out.println("Downloading Java Text Book ");
    }


    boolean isFun;
}