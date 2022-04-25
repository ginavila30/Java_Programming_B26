package day51_inheritance.season;

public class Winter extends Season {
    /*Create a class Winter
child class of Season
constructor: set values to variables
methods:activity(): Print Use Fireplace
*/
    public Winter( int highestAverageTemp,int lowestAverageTemp ){
        super("Winter",highestAverageTemp,lowestAverageTemp);
    }
    @Override
    public void activity(){
        System.out.println("Use Fireplace");
    }

}
