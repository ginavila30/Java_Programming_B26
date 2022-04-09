package day33_methods;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Greeting {

    // How to use parameters
    public static void hello(String name){

        System.out.println("Hello "+name+ ", how are ypu?");

    }

    public static void main(String[] args) {
        hello("Gina");
        hello("James");

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your name");
        String name= input.nextLine();
        hello(name); // I could use hello(input.nextLine());

    }
}
