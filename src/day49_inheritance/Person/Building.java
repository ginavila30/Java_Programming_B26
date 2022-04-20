package day49_inheritance.Person;

import day49_inheritance.Person.Person;
import day49_inheritance.Person.Student;

public class Building {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.name="Gina";
        person1.age=27;
        person1.favHobby="dancing";
        person1.talk();

        Student student1=new Student();
        student1.name="Paula"; // vx inherited from parent (person) class
        student1.age=28;// vx inherited from parent (person) class
        student1.favHobby="swimming";// vx inherited from parent (person) class
        student1.funLevel=10; //vx unique to child class (student)
        student1.talk();// method inherited from parent class (person)
        student1.study();// method unique to child class (student)
        student1.setRace("white");
        System.out.println(student1.getRace());

    }
}


