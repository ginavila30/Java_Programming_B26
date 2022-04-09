package day21_loops;

public class FizzBuzzLoop {
    public static void main(String[] args) {
        int num=0;

        while (num>=0&&num<=50){

            if(num%3==0&&num%5==0){
                System.out.println("FizzBuzz");
            }else if (num%3==0){
                System.out.println("Fizz");
            }else if (num%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(num);
            }
            num++;
        }
    }
}
