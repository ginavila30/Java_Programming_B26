package day12_if_statements;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 3 number, hit enter after each.");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        int num3= scan.nextInt();
        boolean biggerThan1=num1>=num2&&num1>=num3;
        boolean biggerThan2=num2>=num3&&num2>=num1;

        if (biggerThan1){
            System.out.println(""+num1+" is the biggest number");
        }else if (biggerThan2){
            System.out.println(""+num2+" is the biggest number");
        }else{
            System.out.println(""+num3+" is the biggest number");
        }

    }
}
