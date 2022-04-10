package day42_custom_classes;

public class Rectangle {
double base;
double height;
double perimeter;
double area;

public String toString(){
    return "Base: "+base+"\nHeight: "+height+"\nPerimeter: "+perimeter+"\nArea: "+area;
}

public void calculatePerimeter(){
    perimeter=(base*2)+(height*2);

}
public void calculateArea(){

}

}
