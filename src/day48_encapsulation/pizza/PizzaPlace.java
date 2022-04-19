package day48_encapsulation.pizza;

import day48_encapsulation.pizza.Pizza;

public class PizzaPlace {
    public static void main(String[] args) {
        Pizza order1=new Pizza("",8);
        System.out.println(order1.getSize());
        System.out.println(order1.getToppings());
        System.out.println(order1.calculatePrice());
        System.out.println(order1);

        order1.setSize("small");
        order1.setToppings(5);
        order1.calculatePrice();
        System.out.println(order1);

        // Updating static vx to practice

        Pizza.restaurant="Vocelli";
        System.out.println(order1);
    }
}
