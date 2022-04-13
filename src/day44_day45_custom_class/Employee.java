package day44_day45_custom_class;

public class Employee {
    // Class set if instructions to build an object. Contains -> Attributes(variable)& Actions(methods).
    // Instance variables
    //name, id, job title, salary

    String name;
    String id;
    String jobTitle;
    double salary;

    //Q: What does a constructor do?  //Constructor is a special method, that allows us to create an object from it. We don't use static, and this method does not have return type.
    // 2 types of constructor: 1) no arguments -> by default in the class and 2) parameterized -> we create it, and once it is created it overrides the default one.
    // public ConstructorName(same as Class) (parameters){}
    // Q: When is the constructor called? When we are creating an object, and initialize instance variables.

    public Employee (String name, String jobTitle ){
        this.name=name;
        this.jobTitle=jobTitle;
    }

    public Employee(String name, String id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    // Q: What is the difference of a local variable and instance variable. Instance variable-> created inside a class but not a method. Local variable -> created in a method.

   // Q: What is this keyword used for-> it is a reference to object. It tells compiler to reference instance variable.

     public void goToMeeting(){
         System.out.println(name+" is going to a meeting");
     }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
