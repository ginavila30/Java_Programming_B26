package day51_inheritance.shapes;

public class Circle extends Shape {

    public double radius;

    public  Circle(double radius){
        super("Circle");
        this.radius=radius;
    }

    @Override
    public double area(){
        return radius*radius*Math.PI;
    }

    @Override
    public double perimeter() {
        return radius*Math.PI*2 ;
    }

    @Override
    public String toString() {
        return "Name->"+name+" Radius->"+radius;
    }
}
