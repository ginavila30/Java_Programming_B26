package day55_polymorphism.clothes;

public class Store {
    public static void main(String[] args) {
        //All possible objects of Tshirt
        TShirt tShirt1=new TShirt(); //reference is itself
        tShirt1.wear();
        Clothes tShirt2=new TShirt();//reference of parent
        tShirt2.wear();
        Object tShirt3=new TShirt();//reference indirect parent
        //tShirt3.wear(); Object class which is my reference does not have access to the wear method
        //HasHood tShirt4=new TShirt();// Not possible there is no inheritance relation.

        //All possible objects for Jacket

        Jacket jacket1=new Jacket();//reference is itself
        jacket1.wear();
        jacket1.putOnHood();

        Clothes jacket2=new Jacket();//reference is parent class
        jacket2.wear();
        //jacket2.putOnHood(); Clothes does not have access to putOnHood()

        Object jacket3=new Jacket();//reference is super class Object
//        jacket3.wear();
//        jacket3.putOnHood(); They are invalid because Object class doe snt hve access to wear() or puHoodOn();

        HasHood jacket4= new Jacket();// Reference is interface.
       // jacket4.wear(); the interface HasHood does not know or have access to wear method.
        jacket4.putOnHood();

        // The  method below accepts any object that has Clothes as reference. So I can include Jacket or Tshirt
        buy(jacket2);
        buy(tShirt2);
        buy(new Jacket());
        buy(new TShirt());



    }
    public static void buy(Clothes clothesObjects){
       if(clothesObjects instanceof TShirt){
           System.out.println("Bought a T-Shirt");
       }else if(clothesObjects instanceof Jacket){
           System.out.println("Bought a cool Jacket");
       }
    }
}
