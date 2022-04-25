package day51_inheritance.season;

public class Spring extends Season {
    /*Create a class Spring child class of Season
constructor: set values to variables
methods:activity(): Go Outside*/

    public Spring( int highestAverageTemp, int lowestAverageTemp) {
        super("Spring", highestAverageTemp, lowestAverageTemp);
    }

    @Override
    public void activity() {
        System.out.println("Go outside");
    }
}
