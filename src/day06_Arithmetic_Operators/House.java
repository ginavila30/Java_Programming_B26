package day06_Arithmetic_Operators;

public class House {
    public static  void  main (String[]args){
        String houseType="Single House", address="826 Park View Dr.";// I declared and assigned variables at the same time.
        int numberOfBedrooms=4;
        int numberOfBathrooms=2;
        int numberOfKitchen=1;
        double costOfTheHouse= 825_000.22;
        int zipcode=22102;
        boolean isThereBasement=true;
        boolean isThereAttic=false;
        boolean isThereAPool=true;
        boolean isTheHouseForSale=true;
        boolean isAParkNearBy=false;
        double schoolRate=4.5;


        System.out.println("A "+ houseType +" is for sale at "+address+" "+zipcode);
        System.out.println("The house has "+numberOfBedrooms+" bedrooms, "+numberOfBathrooms+ " bathrooms, and "+numberOfKitchen+ " kitchen." );
        System.out.println("The house has abasement "+isThereBasement+"\nThe house has a pool "+ isThereAPool+ "\nThe house has attic "+ isThereAttic+ "\nIs there a park near by "+isAParkNearBy);
        System.out.println("The schools rate is: "+schoolRate+" and, the sale price is: $"+costOfTheHouse);
        System.out.println("Many clients ask if the house is for sale "+ isTheHouseForSale);


    }
}
