package day11_scanner;

public class SingleIfExample {
    public static void main(String[] args) {
        if (false) {
            System.out.println("Hello World");// statement is false so I wont see any result or action. Also no ";" needed
        }
        System.out.println("Sceond Line");// Just testing that it prints  regular statement

        if (true) {
            System.out.println("Today is Monday");
        }

        int score = 60;
        if (score >= 75) {
            System.out.println("Passing");
        }

        if (score < 75) {
            System.out.println("Failing");
        }

        int year = 2021;
        boolean lockdown = year == 2020 || year == 2021;

        if (lockdown) {
            System.out.println("Stay at home");
            System.out.println("Practice Java");
            System.out.println("Wear a mask");
        }
        if (!lockdown) {
            System.out.println("Party");
            System.out.println("Still practice Java");
            System.out.println("Travel");
        }
    }
}
