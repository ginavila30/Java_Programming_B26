package day51_inheritance.season;

public class Season {
    /*Create a class Season
	constructor:- initialize all fields
	methods:- activity(), toString()
		override activity in sub classes*/

    public String name;
    public int highestAverageTemp;
    public int lowestAverageTemp;

    public Season (String name, int highestAverageTemp, int lowestAverageTemp){
        this.name=name;
        this.highestAverageTemp=highestAverageTemp;
        this.lowestAverageTemp=lowestAverageTemp;
    }
    public void activity(){
        System.out.println("Activity");
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestAverageTemp=" + highestAverageTemp +
                ", lowestAverageTemp=" + lowestAverageTemp +
                '}';
    }
}
