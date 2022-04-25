package day51_inheritance.app;

import day51_inheritance.app.App;

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
//
//    public static void main(String[] args) {
//        Instagram insta1=new Instagram(2.3,"pink",9);
//        System.out.println(insta1);
//
//
////        insta1.setCount(100);
////        System.out.println(insta1.getCount());



    }






