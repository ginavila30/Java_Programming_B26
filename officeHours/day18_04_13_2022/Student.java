package day18_04_13_2022;

public class Student {
    /* ======= Task 1 ======= (Parameterized vs No Arg  Constructor |  Chaining | Overloading | This() )
           className --- > Student
           				instance variables:
                    					name, age, batchNumber

                    	1st constructor: initializes the name ONLY

                    	2nd constructor: initializes name & age
           							(MUST apply constructor Call)

                    	3rd Constructor: initializes name, age ,batchNumber
           							(MUST apply constructor Call)

                    	*/
    String name;
    int age;
    int batchNum;
    public Student(String name){
        this.name=name;
    }
    public Student (String name, int age){
        this(name);
        this.age=age;
        joinClass(name);// calling a method inside constructor.
    }
    public Student(String name, int age,int batchNum){
        this(name,age);
        this.batchNum=batchNum;
    }
    public void joinClass(String name){
        System.out.println(name+" is joining class.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNum=" + batchNum +
                '}';
    }
}
