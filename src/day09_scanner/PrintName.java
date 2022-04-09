package day09_scanner;
import java.util.Scanner;
public class PrintName {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("What is yor name? ");
        String name= input.nextLine();
        System.out.println("your name is "+name);


    }
}
