package day48_encapsulation;

import day48_encapsulation.Square;

public class UsingSquare {
    public static void main(String[] args) {

        Square square1=new Square(3); // Creating an object.
        System.out.println(square1);

        System.out.println(square1.getSide());// gets the value of side.
        square1.setSide(5);
        System.out.println(square1.getSide());// Now I should see 5 as the value of side.

        //Below using instance methods:
        System.out.println(square1.calculateArea());// returns area.
        System.out.println(square1.calculatePerimeter());// returns perimeter.

        // Using toString method to print obj info.
        System.out.println(square1.toString());

    }
}
