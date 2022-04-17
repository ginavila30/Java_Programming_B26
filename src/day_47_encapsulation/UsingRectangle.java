package day_47_encapsulation;

public class UsingRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(4,9); // Created object using constructor
        System.out.println(rectangle1.calculatePerimeter()); // Calculated perimeter
        System.out.println(rectangle1.calculateArea());// Calculated Area
        System.out.println(rectangle1);
//Modifying values by using setter method and accessing them by getter method.
        rectangle1.setLengthAndWidth(7,15);
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();
        System.out.println(rectangle1);


    }
}
