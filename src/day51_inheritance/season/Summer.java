package day51_inheritance.season;

public class Summer extends Season {
    /*Create a class Summer
child class of Season	constructor: set values to variables methods: activity(): Drink Lemonade*/

    public Summer( int highestAverageTemp, int lowestAverageTemp) {
        super("Summer", highestAverageTemp, lowestAverageTemp);
    }

    @Override
    public void activity() {
        System.out.println("Drink lemonade");
    }
}
