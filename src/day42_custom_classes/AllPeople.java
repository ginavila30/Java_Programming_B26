package day42_custom_classes;

public class AllPeople {
    public static void main(String[] args) {
        Person personOne = new Person(); // This is how we create an object->instance form the Person class. We instantiate objects.
        Person personTwo = new Person();// Everytime I make an object I use keyword new.

        //Accessing the instances variables
        personOne.age = 27;
        personOne.name = "Gina";
        personOne.height = 1.50;
        personOne.isMarried = true;

        //Printing the instances variables for person 1 (I already assign info for this person)
        System.out.println(personOne.age);
        System.out.println(personOne.name);
        System.out.println(personOne.height);
        System.out.println(personOne.isMarried);

        //Printing the instances variables for person 2 (I did not assign info for this person). I will see default values.
        System.out.println(personTwo.age);
        System.out.println(personTwo.name);
        System.out.println(personTwo.height);
        System.out.println(personTwo.isMarried);

    }
}
