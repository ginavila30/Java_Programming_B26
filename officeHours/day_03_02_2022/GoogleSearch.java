package day_03_02_2022;

public class GoogleSearch {
    public static void main(String[] args) {
        String message = "About 3,640,000,000 results (0.78 seconds)";

        message=message.toLowerCase();

        String resultNumber = message.substring(message.indexOf(" ")+1, message.indexOf("results") - 1);
        String responseTime = message.substring(message.indexOf("(")+1, message.indexOf(")"));

        String output = "Result number is " + resultNumber + "\nResponse time is " + responseTime;

        System.out.println(output);
    }
}
