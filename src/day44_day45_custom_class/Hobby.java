package day44_day45_custom_class;

public class Hobby {
    /* name, annual cost, is outdoors (boolean), requires others (boolean)*/

    String name;
    double annualCost;
    boolean isOutdoor;
    boolean requiresOthers;

    // - create a constructor that creates a Hobby object with the name

    public Hobby(String name) {
        this.name = name;
    }

    //- create a constructor that creates a Hobby object with the name and annual cost
    public Hobby(String name, double annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

    //- create a constructor that creates a Hobby object with the name, annual cost, is outdoors, and requires others
    public Hobby(String name, double annualCost, boolean isOutdoor, boolean requiresOthers) {
        this(name, annualCost);
        this.isOutdoor = isOutdoor;
        this.requiresOthers = requiresOthers;
    }

    //- doIt():     print: Doing $name-of-hobby $outside-or-inside
    public void doIt() {
        System.out.println("Doing " + name + (isOutdoor ? " outside" : "inside"));
    }
    //- toString() print all the Hobby information
    public String toString(){
        return "*Name: "+name+"* Annual cost: $"+annualCost+"* Is outdoor? "+isOutdoor+"* Requires others: "+requiresOthers;
    }
}
