package day25_05_09_2022.person;
/* Person (abstract)
                instance variables:   name, age
                abstract method:      sleep()*/
public abstract class Person {
private String name;
private int age;

public Person(String name, int age){
    this.name=name;
    this.age=age;
}

public abstract void sleep();

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}


