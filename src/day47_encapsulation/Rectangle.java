package day47_encapsulation;

public class Rectangle {
    private double length;
    private double width;
// Constructor
    public Rectangle (double length, double width){
        setLengthAndWidth(length, width);
    }
//Setter Metod
    public void setLengthAndWidth(double length, double width){
        if(length>0){this.length=length;}
        if(width>0){this.width=width;}
    }
//Getter Method
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
//Instance Methods (Belong to object )
    public double calculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return (length*2)+(width*2);
    }

    public String toString(){
        return "Rectangle-> Length: "+length+", Width:"+width+", Area: "+calculateArea()+", Perimeter: "+calculatePerimeter();
    }

}
