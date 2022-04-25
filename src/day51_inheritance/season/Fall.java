package day51_inheritance.season;

public class Fall extends Season {
    /*Create a class Fall
child class of Season
constructor: set values to variables
methods:
activity(): Read A Book
*/

    public Fall(int highestAverageTemp, int lowestAverageTemp) {
        super("Fall", highestAverageTemp, lowestAverageTemp);
    }

    @Override
    public void activity() {
        System.out.println("Read a book");
    }
}
