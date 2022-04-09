package day13_03_28_2022;

import java.util.Scanner;

public class IntegersSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();//jav45ai1000sgre1at82
        int sum = 0;
        int digit = 0;
        String digitStr = "";
        boolean isDigit = false;

        for (int i = 0; i < str.length(); i++) {

           if(!Character.isDigit(str.charAt(i))&&!isDigit){
               continue;
           }
            if (Character.isDigit(str.charAt(i))) {
                digitStr += str.charAt(i);
                isDigit = true;
            }

            if (!Character.isDigit(str.charAt(i)) && isDigit||i==str.length()-1&&isDigit) {
                digit = Integer.parseInt(digitStr);
                sum += digit;
                digitStr="";
                digit = 0;
                isDigit = false;
            }
        }
        System.out.println(sum);
    }

}
