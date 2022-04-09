package day16_Review;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number one:");
        double num1= scan.nextDouble();
        System.out.println("What operator do you want to pick:");
        String operator=scan. next();
        System.out.println("Enter number two:");
        double num2= scan.nextDouble();
        double result=0;// important to assign a default value so java does not complaint.
        boolean valid=true;

        switch (operator){
            case "+":
                result=num1+num2; break;
            case "-":
                result=num1-num2; break;
            case "*":
                result=num1*num2; break;
            case "/":

                if(num2!=0){result=num1/num2;}else{
                    System.out.println("can not divide by 0");
                    valid=false;
                } break;
            case "%":

                if(num2!=0){result=num1%num2;}else{
                    System.out.println("can not divide by 0");
                    valid=false;
                }
                break;
            default:
                System.out.println(operator+ " IS invalid");
                valid=false;


    }
        if(valid){System.out.println(result);}


    }
}
