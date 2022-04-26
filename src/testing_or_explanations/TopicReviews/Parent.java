package testing_or_explanations.TopicReviews;

public class Parent {
    // Attributes

    private int age;// instance vx-> object
    public String name;//instance vx-> object
    static String planet;//static vx-> class

    static {planet="Earth";}//static block, initializer for static vx.

    public Parent(String name){ // constructor.
       this.name=name;// this keyword indicated instance.
    }
    public Parent (String name, int age){ // constructor overloading, private vx can be initialized by constructor but obj won't be able to access the private vx directly.
        this(name);//constructor chaining by using this().
        this.age=age;
    }

    public void display(){
        System.out.println(name+" lives in planet "+planet+" and is a parent class");
    }




}
