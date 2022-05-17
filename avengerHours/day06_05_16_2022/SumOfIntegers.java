package day06_05_16_2022;
/* Task 02 ;    Write a program that can return the sum of digits of an integer. Do not use any string manipulations.

                 Ex;
                 Input: 123
                 Output: 6*/
public class SumOfIntegers {

    public static int sumOfDigits(int num){
        int sum=0;//+5
        while (num>=9){
            sum+=num%10;
            num=num/10;
        }
        return sum+num;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(15));
    }
}
