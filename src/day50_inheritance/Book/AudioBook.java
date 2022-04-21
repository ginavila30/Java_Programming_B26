package day50_inheritance.Book;

public class AudioBook extends Book{
    public double duration;
    public String narrator;

//    public AudioBook(String title ){
//        this.title=title;
//    }

    public void listen(){
        System.out.println("listening to "+title+" narrated by "+narrator);
    }

}
