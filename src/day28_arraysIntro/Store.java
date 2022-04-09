package day28_arraysIntro;
/* // Do we have jackets in stock?*/
import java.util.Arrays;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System. in);

        String [] items={"Shoes","Jackets","Gloves","Airpods","Shoes"};
        boolean available = false;
        System.out.println("What item are you looking for?");
        String lookingFor= scan.nextLine().toLowerCase();

        for (int i = 0; i < items.length; i++) {

            if(items[i].equalsIgnoreCase(lookingFor)){

                available=true;
                break;
            }

        }
        System.out.println("Is the item available: "+ (available?"Yes":"No"));

        // short approach using only String manipulation.

        System.out.println(Arrays.toString(items).toLowerCase().contains(lookingFor));
    }
}
