package day47_encapsulation;

public class Pizza {
//Instance Vxs
    private String size;
    private  int toppings;
//Static Vxs
    public static String restaurant;
//Static block initializer
    static {
        restaurant="Paisanos";
    }
//Constructor

public Pizza (String size, int toppings){
     setSize(size);
     setToppings(toppings);
}
// Setter Method for private instance vxs
    public void setSize(String size){
        switch (size.toLowerCase()){
            case "small":
            case "medium":
            case "large":
                this.size=size;
        }
    }

    public void setToppings (int toppings){
        if(toppings>0){
            this.toppings=toppings;
        }
    }
 //Getter Method for private instance vxs
 public  String getSize(){
        return size;
 }

 public int getToppings(){
        return toppings;
 }

//Instance Methods

public double calculatePrice(){
      double totalPrice=0;
      switch (size.toLowerCase()){
          case "small":totalPrice+=4; break;
          case "medium": totalPrice+=6; break;
          case "large": totalPrice+=8; break;
      }
      totalPrice+=(toppings*0.75);

      return totalPrice;
}

public String toString(){
        return restaurant+" Pizza Size: "+size+", Number of Toppings: "+toppings+", Total Price: $"+calculatePrice();
}


}
