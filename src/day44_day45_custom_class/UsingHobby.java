package day44_day45_custom_class;

import java.util.ArrayList;
import java.util.Arrays;

public class UsingHobby {
    public static void main(String[] args) {
        // - create an ArrayList of Hobby objects
        ArrayList<Hobby>allHobbies=new ArrayList<>();
        // - create and add a couple Hobby objects
        allHobbies.addAll(Arrays.asList(new Hobby("Tennis",400,true,true),new Hobby("Hiking",5000,true,false),new Hobby("Biking",15000,true,false),new Hobby("Dancing",200,false,true)));
        //- iterate through the ArrayList and execute the doIt() method on each Hobby object
        for (Hobby each:allHobbies) {
            each.doIt();
        }
        //   - create a copy ArrayList and remove all outdoors Hobbies
        ArrayList<Hobby>indoorHobbies=new ArrayList<>(allHobbies);
        indoorHobbies.removeIf(hobby -> hobby.isOutdoor);
        System.out.println(indoorHobbies);
        //- create a copy ArrayList and remove all hobbies requiring other people
        ArrayList<Hobby>indivHobbies=new ArrayList<>(allHobbies);
        indivHobbies.removeIf(hobby -> hobby.requiresOthers);
        System.out.println(indivHobbies);
        // - create a copy ArrayList and remove all hobbies that cost more than $500 annually
        ArrayList<Hobby>affordableHobbies=new ArrayList<>(allHobbies);
        affordableHobbies.removeIf(hobby -> hobby.annualCost>500);
        System.out.println(affordableHobbies);

        //Q: What is some difference between Array and ArrayList
        // Array has fixed size, accepts non-primitive (objects) and primitive data types, does not have methods by itself, it works with Arrays.Class methods, requires toString method to be printout.
        //Array list has dynamic size, accepts only object types, has its own methods and also works with collections methods, it can be printed without any additional method.
        //Q: How does our custom class objects work with ArrayList
        //Array list store object types, therefore the new custom object can be added to the ArrayList, The class is the data type.Each object added is an element of the ArrayList.
        //Q: What is an object
        //Objects are non-primitive data types, and are an instance of a class, based on the attributes and actions included in the class, the object will have a copy of those.
        //Q: How does removeIf method work
        //remove if works as a loop that goes through the elements, checking the condition declared, if the condition is true that element is removed from the ArrayList.
        //Q: How does Arrays.asList method work
        //Arrays.asList converts the argument given in to a list(collection type). You can give as argument an arrayName, or the elements by themselves separated by comma.

    }
}
