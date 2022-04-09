
/* Write a program that asks the user to enter 3 angle numbers ( can be floating numbers )
    Determine if the angles make a triangle, which means the angles add to 180.0
    and
    Determine if the angles make a circle, which means the angles add to 360.0*/
package day10_scanner;
import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the value of 3 angles. Hit enter after each value.");
        double angle1= input.nextDouble();
        double angle2= input.nextDouble();
        double angle3= input.nextDouble();

        double sum=angle1+angle2+angle3;

        boolean isItATriangle=(sum)==180;
        System.out.println("Do the angles make a triangle? "+isItATriangle);
        boolean isItACircle=(sum)==360;
        System.out.println("Do the angles make a circle? "+isItACircle);
    }
}
