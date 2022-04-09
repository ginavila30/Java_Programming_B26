package day21_loops;

public class ReplaceMethod {
    public static void main(String[] args) {

        String s="java is a language";
        s=s.replace('a','e');
        System.out.println(s);

        String day="Today is Monday Monday";
        day=day.replace("Monday","Tuesday");
        System.out.println(day);

// below the way to replace the second monday only.
        String target = "Today is monday. we will monday. its monday";

        int firstIndex = target.indexOf('.');
        int secondIndex = target.lastIndexOf('.');
        String middleStr = target.substring(firstIndex, secondIndex);
        middleStr = middleStr.replace("monday", "weekday");

        System.out.println(target.substring(0 , firstIndex) + middleStr + target.substring(secondIndex));
}}
