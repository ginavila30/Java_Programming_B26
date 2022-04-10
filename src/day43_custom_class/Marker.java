package day43_custom_class;

public class Marker {
    String type;
    String brand;
    String color;
    //Constructor does not have static modifier or return type. But it does have parameters if needed.
    public Marker (String inputType,String inputBrand,String inputColor){
        // Below I am assigning parameters(local variables) to instance variables
        type=inputType;
        brand=inputBrand;
        color=inputColor;
    }
//Calling to string method.
    @Override
    public String toString() {
        return "Marker{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
