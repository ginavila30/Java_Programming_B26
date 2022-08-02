package testing_or_explanations.CodingPractice;
// palindrome with number without converting number to String
public class NumberPalindrome {
    public static String numberPalindrome(int num){ //125
        int copyOfNum=num;//125
        int temp=0;//521

        do{
            temp=temp*10+(num%10);
            num=num/10;//1
        }while(num%10!=0);

            return temp==copyOfNum?"palindrome":"not palindrome";
    }

    public static void main(String[] args) {
        System.out.println(numberPalindrome(-121));
        ;
    }
}
