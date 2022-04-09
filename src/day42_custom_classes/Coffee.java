package day42_custom_classes;

public class Coffee {

    String brand;
    double price;
    double size;
    String type;

    public String toString(){
String result = "";
result+= "*Brand:"+brand+" *Price: "+price+" *Size: "+size+" *Type: "+type;
return result;
    }

    public void drink (){
        System.out.println("Drinking "+type);
        size-=1.5;
    }

    public void refill (double amountOz){
        System.out.println("Refilling "+amountOz+" oz of coffee");
        size+=amountOz;
    }




}
