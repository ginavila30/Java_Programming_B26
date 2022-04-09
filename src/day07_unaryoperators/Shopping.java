package day07_unaryoperators;

public class Shopping {
    public static void main(String[] args) {
        int numberOfItems=0;
        double price=0.0;

        System.out.println("we pick up 1 water");
        System.out.println("how many items in cart"+ ++numberOfItems);// preincrement number increased right away.
        price=price+2.5;
        System.out.println("we picked up 2 eggs");
        System.out.println("how many items in cart"+ ++numberOfItems);
        System.out.println("how many items in cart"+ ++numberOfItems);

        System.out.println(numberOfItems++);// post increment prints first the value of the variable before the increase.
        System.out.println(numberOfItems);// after that I run only the variable, and it shows the incremented value.


    }
}
