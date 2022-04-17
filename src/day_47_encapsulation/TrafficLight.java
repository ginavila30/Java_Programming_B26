package day_47_encapsulation;


public class TrafficLight {
     private String color;

    public TrafficLight (String color){
        setColor(color); // Using setter method in constructor to control the valid input.
    }
    public String getColor(){
        return color;
    }

    public void setColor(String color){
     switch (color.toLowerCase()){
         case "red":
         case "green":
         case"yellow":this.color=color;
    }}

    @Override
    public String toString() {
        return "TrafficLight{" +
                "color='" + color + '\'' +
                '}';
    }
}
