package interviewNadir;
/* Method returns boolean and accepts Strings 2 true if contains one another*/
public class JuneFifteen {
    public static boolean containsStr(String str1, String str2) {//my apple mac  mac
        if(str2.length()>=str1.length()){
            for (int i = 0; i <str2.length()-(str1.length()-1) ; i++) {
                if(str2.substring(i,i+str1.length()).equals(str1)){
                    return true;
                }
            }
        }else{
            for (int i = 0; i <str1.length()-(str2.length()-1) ; i++) {
                if(str1.substring(i,i+str2.length()).equals(str2)){
                    return true;
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(containsStr("windows","my apple mac"));
    }
}
