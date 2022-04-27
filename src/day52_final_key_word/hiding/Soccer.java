package day52_final_key_word.hiding;

public class Soccer extends Sports {

    public static void cheer(){
        System.out.println("Cheering from the child class");
    }

    // it looks like we are overriding, but we are not because the method is static. Instead, we are hiding
    //This is called hiding since I can't override static methods, so it is called hiding when a static method implementation is changed in the child class

}
