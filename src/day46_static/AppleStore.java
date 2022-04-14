package day46_static;


public class AppleStore {
    public static void main(String[] args) {
        Iphone phone =new Iphone("iphone X",1000); //First static block runs because I first call the class then the constructor
        System.out.println(phone);
        Iphone phone2 =new Iphone("iphone 13",1400);// only constructor runs, the static block does not run again, because it only runs once, and it already happened on line 7.
        System.out.println(phone2);
        //working with static vxs below
        System.out.println(Iphone.company);
        Iphone.company="android";
        System.out.println(Iphone.company);

    }
}
