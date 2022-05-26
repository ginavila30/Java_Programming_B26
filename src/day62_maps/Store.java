package day62_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Map<String, Double>store= new HashMap<>();
        store.put("water",1.5);
        store.put("coffee",2.5);
        store.put("apples",0.99);
        store.put("bread",2.35);
        store.put("cucumbers",3.89);


        System.out.println("Inventory");

         for (String key:store.keySet()) {
             System.out.println("Item: "+key+" for $"+store.get(key));
        }
        for (Map.Entry<String, Double>entry:store.entrySet()) {
            System.out.println("Item: "+entry.getKey()+" for $"+entry.getValue());
        }

        Scanner input=new Scanner(System.in);

        System.out.println("What item do you want?");
        String item= input.nextLine();
        System.out.println(store.containsKey(item)?item+" in stock for $"+ store.get(item):"Not available");


    }

}
