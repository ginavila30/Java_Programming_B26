package day23_05_03_2022.person;

public class Person {
    String name;
    char gender;
    int age;

    public Person(String name, char gender, int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    public void eat(){
        System.out.println( "Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
    public void drink(){
        System.out.println("Drinking");
    }

}
