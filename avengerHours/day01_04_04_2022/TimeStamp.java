package day01_04_04_2022;

public class TimeStamp {
    public static String timeStamp(String dateWithTime) {

        String result = "// ";
        for (int i = 0; i < dateWithTime.length(); i++) {
            if (Character.isDigit(dateWithTime.charAt(i))) {
                result += dateWithTime.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(timeStamp("10/10/2022 14:59:00"));
    }
}
