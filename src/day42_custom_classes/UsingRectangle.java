package day42_custom_classes;

public class UsingRectangle {
    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle();
         rectangleOne.base=3.5;
         rectangleOne.height=4;

         rectangleOne.calculateArea();
         rectangleOne.calculatePerimeter();
        System.out.println(rectangleOne);
    }
}
