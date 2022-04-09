package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountries {
    public static ArrayList<String> removeCountries(ArrayList<String>countries,int num){
        countries.removeIf(each->each.length()>=num);
        return countries;
    }

    public static void main(String[] args) {
       ArrayList<String>countries=new ArrayList<>(Arrays.asList("Japan", "Korea", "United States", "Turkey", "United Kingdom",
               "Canada"));
        System.out.println(removeCountries(countries, 7));
    }
}
