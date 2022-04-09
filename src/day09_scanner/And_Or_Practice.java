package day09_scanner;

public class And_Or_Practice {
    public static void main(String[] args) {

        boolean isRaining= true;
        int temperature=78;
        boolean isGoodWeather= temperature >=65 && temperature<100;

        boolean goingForAWalk=!isRaining && isGoodWeather;

        System.out.println("Is the person going for a walk: "+goingForAWalk);

    }
}
