package day42_custom_classes;

public class Car {
    String model;
    int year;
    String color;
    int fuelLevel;

    public String toString() {
        return "Model "+model+"\nYear "+year+"\nColor "+color+"\nFuel level "+fuelLevel;
    }
     public void drive(){
         System.out.println("Driving "+model);
         fuelLevel-=5;
     }
     public void fillTank(){
         System.out.println("Filling tank");
         fuelLevel=100;
     }

     public boolean isLow(){
        return fuelLevel<25;
     }

}
