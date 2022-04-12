package day44_custom_method;

import day44_custom_method.Offer;

public class UsingOffer {
    public static void main(String[] args) {
        Offer company1=new Offer("Oracle","VA");
        System.out.println(company1);
        System.out.println("=========================================================");
        Offer company2=new Offer("VA","Oracle",150000,true,15);
        System.out.println(company2);
        System.out.println("=========================================================");
        Offer company3=new Offer("Oracle","VA",150000);
        System.out.println(company3);

    }
}
