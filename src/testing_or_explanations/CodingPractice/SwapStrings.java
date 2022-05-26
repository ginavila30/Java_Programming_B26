package testing_or_explanations.CodingPractice;

public class SwapStrings {
    public static void main(String[] args) {

        String str1="I love Java";
        String str2="Selenium is cool";

        str1+=str2;//applebanana
        str2=str1.substring(0,str1.indexOf(str2));//apple
        str1=str1.substring(str2.length());

        System.out.println(str1);
        System.out.println(str2);
    }
}
