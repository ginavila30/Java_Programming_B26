package testing_or_explanations.dardanTasks;
/*6) Numbers - Prime Number
Write a method that can check if a number is prime or not*/
public class PrimeNumber {
    public static String  isPrime(int num){
        int count=0;
        for (int i = 1; i <=num ; i++) {
            if(num%i==0){
                count++;
            }
            if(count>2){break;}
        }

        return count>2?"Not Prime":"Prime";

    }

    public static void main(String[] args) {
        System.out.println(isPrime(470));
    }
}
