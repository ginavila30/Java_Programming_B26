package interviewNadir;

public class StringContainsSecondString {
    public static boolean strContainsSecondStr(String str1, String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        return (str1.contains(str2))||(str2.contains(str1));
    }

    public static void main(String[] args) {
        System.out.println(strContainsSecondStr("Apple", "My apple"));
    }
}
