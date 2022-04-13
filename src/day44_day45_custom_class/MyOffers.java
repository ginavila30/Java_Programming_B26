package day44_day45_custom_class;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer first = new Offer("Texas", "Google", 200000, true, 15);
        ArrayList<Offer> allOffers = new ArrayList<>();
        allOffers.add(first);
        allOffers.add(new Offer("New York", "Amazon", 180000, true, 15));
        System.out.println(allOffers);

        Offer[] moreOffers = {
                new Offer("Chicago", "Apple", 230000, false, 10),
                new Offer("Texas", "Tesla", 250000, false, 20),
                new Offer("Florida", "Facebook", 120000, true, 10)
        };
        allOffers.addAll(Arrays.asList(moreOffers)); // added the arr moreOffers to the allOffers list.
        System.out.println(allOffers);

        //added elements(Offer objects) to allOffers by using Arrays.asList method var args...
        allOffers.addAll(Arrays.asList(
                new Offer("Chicago", "Discord", 150000, false, 13),
                new Offer("Canada", "Netflix", 170000, true, 12)));

        //Creating ArrayList to filter the offers

        ArrayList<Offer> salaries=new ArrayList<>(allOffers);
        salaries.removeIf(each->each.salary<170000);
        System.out.println("check->"+salaries);

        ArrayList<Offer> fullTime=new ArrayList<>(allOffers);
        fullTime.removeIf(each-> !each.isFullTime);
        System.out.println(fullTime);

    }

}
