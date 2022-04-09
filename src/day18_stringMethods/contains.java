package day18_stringMethods;

public class contains {
    public static void main(String[] args) {
        String day="Today it is above 70";
        System.out.println(day.contains("it is"));//true
        System.out.println(day.contains("itis"));//false
        System.out.println(day.contains("ay it"));//true
        System.out.println(day.contains("7"));//true
        System.out.println(day.contains("today"));// false, we have today with uppercase.
        System.out.println(day.contains("Ti7"));// false, the method checks for the sequence of characters not isolated characters.
        System.out.println(day.contains(" "));
    }
}
