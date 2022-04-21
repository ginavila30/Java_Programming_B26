package testing_or_explanations.TopicReviews;

public class Person {
    // Attributes

    // Instance vxs-> variables created in the class but outside of the method. They belong to object.
    //Local vxs -> variables created within scope {}.
    String name;// instance
    int age;// instance
    String hairColor;

    static boolean haveLegs;// static


    static { //static block
        System.out.println("Static running");
        haveLegs=true;
    }



    // Actions

    public void breathing(){
        System.out.println("Person is breathing");
    }
    // Constructor

    public Person(String name, int age){
      this.name =name; // this keyword tells compiler that I am referencing instance vxs
       this.age =age;

    }

    public Person(String name, int age, String hairColor){
        this(name, age);
        this.hairColor=hairColor;
    }



    //How to print and not to get hashcode -> using toString method
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
