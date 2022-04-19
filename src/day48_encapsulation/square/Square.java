package day48_encapsulation.square;

public class Square {
//Instance Vx
   private double side;
//Constructor
   public Square(double side){
      setSide(side);
      calculateArea();
      calculatePerimeter();
   }
//Setter Method
   public void setSide(double side){
       if(side>0){
       this.side=side;}
   }
//Getter Method
   public double getSide(){
       return side;
   }
//Instance methods
  public double calculateArea(){
       return side*side;
   }
   public double calculatePerimeter(){
       return side+side+side+side;
   }

    @Override
    public String toString() {
        return "Square-> Side: "+side+", Area: "+calculateArea()+", Perimeter: "+calculatePerimeter();
    }
}
