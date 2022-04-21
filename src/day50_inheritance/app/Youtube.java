package day50_inheritance.app;

public class Youtube extends App {
//    Create a class Youtube
//
//    - Youtube class inherits App class
//
//    - create constructor to call parent constructor and set up variables (name and version)
//
//    - create method:
//    watchVideo()
//    Example output: prints Watching java tutorial
    public Youtube(double version){
        super("Youtube",version);
    }

    public void watchVideo(){
        System.out.println("Watching Java tutorial");
    }

}
