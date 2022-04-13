package day44_day45_custom_class;

import java.util.ArrayList;
import java.util.Arrays;

/*Make a class for Offer objects (from class)

    try to create 7 objects of Offer class and store them into an ArrayList of Offer
       maintain the list to keep the offers from your local area
    maintain the list to to keep only full time offers*/

public class UsingOfferWithArrayList {
    public static void main(String[] args) {
        Offer number1=new Offer("Oracle","VA");
        Offer number2=new Offer("Apple","VA",120000);
        Offer number3=new Offer("MD","Windows",150000,true,12);
        Offer number4=new Offer("MD","Oracle",120000,false,20);
        Offer number5=new Offer("TX","Acceso",80000,true,20);
        Offer number6=new Offer("VA","Red Hat",150000,true,25);
        Offer number7=new Offer("Central Reach","VA");
        ArrayList<Offer>list1=new ArrayList<>(Arrays.asList(new Offer[]{number1,number2,number3,number4,number5,
                number6,number7}));
        ArrayList<Offer>local=new ArrayList<>();

        for (Offer each:list1) {
            if(each.location.equalsIgnoreCase("va")){
             local.add(each);
            }
        }
        list1.retainAll(local);
        System.out.println(list1);

        ArrayList<Offer>list2=new ArrayList<>(Arrays.asList(new Offer[]{number1,number2,number3,number4,number5,
                number6,number7}));
        ArrayList<Offer>fullTime=new ArrayList<>();

        for (Offer each:list2) {
            if(each.isFullTime== true){
                fullTime.add(each);
            }
        }
        list2.retainAll(fullTime);
        System.out.println(list2);

    }
}
