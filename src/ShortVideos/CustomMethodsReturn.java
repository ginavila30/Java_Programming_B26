package ShortVideos;

public class CustomMethodsReturn {

    public static void main(String[] args) {

        System.out.println(reverse("wooden spoon")); // Here only printing the return
        String s1=reverse("wooden spoon"); // Here reusing the return data to store it in a variable
        System.out.println(s1);

        System.out.println(isPalindrome("anna"));
    }

    // return method-> means that we can reuse the data from the method.
    public static int sum(int a,int b){
        int result=a+b;
        return result;
    }
// created a method to reverse a String.
    public static String reverse(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
           result+=str.charAt(i);
        }
        return result;
    }
// created a method to check if a string is palindrome(inside this method I used the method reverse that I created previously.
    public static boolean isPalindrome(String str){
       String reversedVersion= reverse(str);

       return str.equalsIgnoreCase(reversedVersion);

    }
}
