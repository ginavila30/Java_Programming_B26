package day54_05_03_2022.creating;

public class Book implements Create{ //Book is a Create -> which means book implements Create (This is how you describe interface relation)
    @Override
    public void read() {
        System.out.println("Reading a book");
    }

    @Override
    public void write() {
        System.out.println("Writting a book");
    }
}
