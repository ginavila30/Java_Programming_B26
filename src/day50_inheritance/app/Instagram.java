package day50_inheritance.app;

public class Instagram extends App {
//    Create a class Instagram
//
//    - Instagram class inherits App class
//
//    - create constructor to call parent constructor and set up variables (name and version)
//
//    - create method:
//    postPicture()
//    Example output: prints Posting picture to Instagram
String color;
    public Instagram(double version, String color){
        super("Instagram",version);
        this.color=color;
    }

    public void postPicture(){
        System.out.println("Posting Picture");
    }

    public String toString(){
        return "App->" +name+" Version->"+version+" Color->"+color;
    }
}
