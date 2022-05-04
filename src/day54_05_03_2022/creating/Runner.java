package day54_05_03_2022.creating;

public class Runner {
    public static void main(String[] args) {

        Book obj=new Book();//Book is a normal (non abstract) class
        obj.read();// These methods were implemented in to book from interface
        obj.write();
    }
}
