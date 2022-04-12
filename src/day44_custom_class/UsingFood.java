package day44_custom_class;

public class UsingFood {/* Create a separate class to create and test the Food objects

        try making an array of Food objects
        find all the Food objects that start with 'a'
        find all the Food objects that have a total price over 20
*/

    public static void main(String[] args) {
        Food food1=new Food("Fries");
        System.out.println(food1);
        Food food2=new Food("Apple",5);
        food2.calculatePrice(5,2.5);
        System.out.println(food2);

        Food food3= new Food("Strawberries",10,1.5);
        System.out.println(food3);
    }
}
