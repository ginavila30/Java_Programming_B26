package testing_or_explanations.dardanTasks;
/*String -- Reverse
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA*/
public class ReverseString {
    public static String reverseStr (String str){
        String result ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("ABCD"));
    }
}
