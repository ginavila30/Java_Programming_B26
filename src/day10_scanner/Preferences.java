package day10_scanner;
import java.util.Scanner;
public class Preferences {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter your age: ");// when I do print I can enter the value in the console in the same line as the request.
        byte age= input.nextByte();
        System.out.println("Enter your favorite number:");// when I do println I enter the value in the console in the next line, after the request.
        long favNum= input.nextLong();
        System.out.println("Enter the name of your favorite book: ");
        input.nextLine();// enter an extra next line method to empty the scanner memory.
        String favBook= input.nextLine();
        System.out.println("The person age is: "+age+"\nThe person favorite number is: "+favNum+"\nThe person favorite book is: "+ favBook);
    }
}
