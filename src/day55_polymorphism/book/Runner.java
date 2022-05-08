package day55_polymorphism.book;
/*Create a runner class Library

    create objects of the JavaTextbook with all possible references and try to access all the variables and methods with each reference*/
public class Runner {
    public static void main(String[] args) {
        Book book1=new JavaTextBook();
        book1.name="Java Text Book";
        book1.read();

        Downloadable book2=new JavaTextBook();
        book2.download();

        E_Book book3=new JavaTextBook();
        book3.name="Java Text Book Advanced";
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

        Book book5= new JavaTextBook();
        Book book6= new SeleniumBook();


    }
}
