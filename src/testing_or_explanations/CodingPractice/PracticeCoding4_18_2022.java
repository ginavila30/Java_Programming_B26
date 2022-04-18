package testing_or_explanations.CodingPractice;

public class PracticeCoding4_18_2022 {
//    Swap two variable' values without using a third variable
//    int a =10; int b =20;

    public static void main(String[] args) {
        int a=10;
        int b=20;

        a+=Math.abs(b);
        b-=Math.abs(a);
        a-=Math.abs(b);


        System.out.println(a);
        System.out.println(Math.abs(b));

//        Write a program that will count how many times “java” is found in any given String:
//
String str="Kac defa java geceiyok ki java sayisini javada say";
int count=0;

        for (int i = 0; i <str.length()-4 ; i++) {
            if(str.substring(i,i+4).equalsIgnoreCase("java")){
                count++;
            }
        }
        System.out.println(count);

        System.out.println(PracticeCoding4_18_2022.palindrome("hello"));
    }
    
    public static String palindrome(String str){
        String reversed="";
        for (int i = str.length()-1; i>=0 ; i--) {
            reversed+=str.charAt(i);
        }
        return str.equalsIgnoreCase(reversed)?"Palindrome":"Not palindrome";
    }
}
