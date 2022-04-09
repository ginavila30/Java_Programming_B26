package day14_nested_if_statements;
/*Amazon prime example, if amazon member 2 day free shipping if not amazon member check product price.*/

import java.util.Scanner;

public class AmazonPrime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your product price:");
        double price= scan.nextDouble();
        System.out.println("Enter your product price:");
        boolean hasPrime= scan.nextBoolean();
        String message;

        if(hasPrime){
            message="Eligible for 2 day shipping";
        }else{
            if(price>=25){message="Eligible for regular free shipping";}else{message="Not eligible for free shipping. Shipping fee:$3.99";}
        }
        System.out.println(message);
    }
}
