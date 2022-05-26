package testing_or_explanations.dardanTasks;

/*Numbers - Armstrong numbers
Write a method that can check if a number is Armstrong  number*/
public class Armstrong {
    public static boolean armstrong(int num) {
        int copyOfNum = num;
        String numOfDigits = String.valueOf(num);
        int times = numOfDigits.length();
        int sum = 0;
        int multipl;
        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            multipl=1;
            for (int i = 0; i < times; i++) {
                multipl*=digit;
            }
            sum+=multipl;

        }

        return sum==copyOfNum;


    }



    public static void main(String[] args) {
        System.out.println(armstrong(370));
    }
}
