package day46_static;

public class BestBuyStores {
    public static void main(String[] args) {
        System.out.println(BestBuy.headquarters);// accessing static vx by calling it from class name.
        System.out.println(BestBuy.day);// accessing static vx by calling it from class name.
        System.out.println(BestBuy.numberOfComputers);// accessing static vx by calling it from class name.

        BestBuy store1=new BestBuy("Oak Drive");
        System.out.println(store1.location);//Accessing instance vx
        System.out.println(store1.numberOfComputers);//Accessing static vx from the object because the static vx belongs to the classes but each object created from that class gets a copy of everything. Intellij assumes it does not work, so you need to type fully.

        store1.numberOfComputers--;//# of computers is static, shared by all objects possibly created from that class. so the value will change for all of them.
        System.out.println(BestBuy.numberOfComputers);

        BestBuy store2=new BestBuy("Main st");
        store2.numberOfComputers-=5;// this is subtracting from the static vx so value will change for all the objects.
        System.out.println(store1.numberOfComputers);// this line and the one below are printing same vx same value, just being called one from object other from class.
        System.out.println(BestBuy.numberOfComputers);// this line and the one above are printing same vx same value, just being called one from object other from class.

        store2.location="Fairfax Dr.";// this is instance vx, when reassigning value it affects only the object being called not the others.
        System.out.println(store2.location);

        BestBuy.restock();//static methods.
        System.out.println(BestBuy.numberOfComputers);// the static method above increased the value of numbersOfComp which is shared by all objects.
        store1.restock();// accessing the static method from the object because object has a copy of the class and static method was created din class. But ideally it is always called from class and not object.
        System.out.println(BestBuy.numberOfComputers);

        //BestBuy.openStore(); this is error because openStore() is an instance method, and therefore it should be called by the  object not the class. Below the right approach.

        store1.openStore();

    }
}
