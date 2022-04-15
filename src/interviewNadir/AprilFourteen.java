package interviewNadir;
// last 3 chars
public class AprilFourteen {
    public static String checkForChars(String str) {
        String result = "";
        if (str.length() < 3) {
            System.out.println("Invalid value");
        } else {
            result = str.substring(str.length() - 3);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(checkForChars("apple"));
    }
}
