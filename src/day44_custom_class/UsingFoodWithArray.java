package day44_custom_class;

import java.util.Arrays;

public class UsingFoodWithArray {
    public static void main(String[] args) {
        Food food1=new Food("Avocado",10,2.5);
        Food food2=new Food("Apple",3,1.5);
        Food food3=new Food("Banana",10,.75);

        Food[]foods={food1,food2,food3};

        String elementsWithA="";
        for (int i = 0; i <foods.length ; i++) {
            if(foods[i].name.toLowerCase().startsWith("a")){
                elementsWithA+=foods[i].name+" ";
            }
        }
        System.out.println(elementsWithA);

        String priceOver20="";
        for (int i = 0; i <foods.length ; i++) {
            if(foods[i].Totalprice>=20){
               priceOver20+=foods[i].name+" ";
            }
        }
        System.out.println(priceOver20);


      //  String[]arr={String.valueOf(food1), String.valueOf(food2), String.valueOf(food3)};
//          String elementsWithA="";
//
//        for (String each :arr) {
//           String[]elements= each.split("'");
//            System.out.println(Arrays.asList(elements));
//            if(elements[1].trim().toLowerCase().startsWith("a")){
//                elementsWithA+=elements[1]+" ";
//            }
//        }
//        System.out.println(elementsWithA);

        }

    }

