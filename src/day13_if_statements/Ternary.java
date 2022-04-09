package day13_if_statements;

public class Ternary {
    public static void main(String[] args) {
        int a=4;
        if (a%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        String result=a%2==0?"Even":"Odd"; // syntax for ternary if. this is the same but with a different approach as line 6-10.
        System.out.println(result);

        int num=-3;
        String posOrNeg=num>0?"positive":num<0?"negative":"zero"; // multibranch ternary example.
        System.out.println(posOrNeg);

        int time=12;
        double price;
        price=time>=10&&time<=15?7.99:10.99;// Ternary example with a variable different than String

        System.out.println(price);
    }}
