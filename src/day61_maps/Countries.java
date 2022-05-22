package day61_maps;

import java.util.*;

public class Countries {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> countries=new HashMap<>();

        countries.put("United States",new ArrayList<>(Arrays.asList("Chicago", "New York","Dallas","DC","Denver","LA")));
        countries.put("Turkey",new ArrayList<>(Arrays.asList("Istanbul", "Ankara","Izmir")));
        countries.put("Canada",new ArrayList<>(Arrays.asList("Quebec", "Toronto","Vancouver")));

        System.out.println(countries);
        // printout all cities that start with D or I

        for(ArrayList<String> cities:countries.values()){// goes through the values of the map which are array lists
            for (String city:cities) { //goes through the cities (elements) inside each array list
                if(city.startsWith("D")||city.startsWith("I")){
                    System.out.println(city);
                }
            }
        }

        System.out.println("What country do you want to tour?");

        Scanner input=new Scanner(System.in);
        String country=input.nextLine();

        for (String cities: countries.get(country)){
            System.out.println("Touring... "+cities);
        }
    }
}
