package testing_or_explanations.dardanTasks;

import java.text.DecimalFormat;

/*2) Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator*/
public class NumbersDivideWithoutOperator {

    public static double divideWithoutOperator(int dividend, int divisor) {
        int count = 0;
        int countDecimal = 0;

        double result = 0;

        if (dividend > divisor) {
            while (dividend >= divisor) {
                dividend -= divisor;
                ++count;
            }
            result += count;

            if (dividend!=0) {
                dividend *= 10;
                while (dividend >=divisor) {
                    dividend -= divisor;
                    ++countDecimal;
                }
                result += (countDecimal * 0.1);
            }
        }else{
            result=1;
            while (dividend<divisor){
                dividend*=10;
                result*=0.1;
            }
            while (dividend >=divisor) {
                dividend -= divisor;
                ++countDecimal;
            }
            result *= (countDecimal);

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(divideWithoutOperator(22, 5));
    }


}
