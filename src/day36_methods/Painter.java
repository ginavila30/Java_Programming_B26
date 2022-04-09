package day36_methods;

public class Painter {
    // using draw method, which is an overloaded method.Using same method name but 3 different parameters.
    public static void main(String[] args) {
        Picture.draw();
        Picture.draw(100);
        Picture.draw("red");
        Picture.draw("blue", "green");

        String s="200";
        Picture.draw(s);
    }






}
