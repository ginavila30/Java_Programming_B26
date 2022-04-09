package day33_methods;

public class day33_Methods {
    public static void main(String[] args) {// I need my main method to run the methods I created below.
        helloWorld();
        helloWorld50();
    }

    public static void  helloWorld(){ // Method to print hello world
        System.out.println("Hello World");
    }
    public static void helloWorld50(){
        for (int i = 0; i <50 ; i++) { // Method to print hello world 50 times
            System.out.println("Hello World");
        }
    }
}
