package day52_final_key_word.hiding;

public class Game {
    public static void main(String[] args) {
        Sports.cheer();// Calling the methd from the parent class
        Soccer.cheer();// Calling the method from child class. This is called hiding since I cant override static methods, so it is called hiding when a static method implementation is changed in the child class
    }
}
