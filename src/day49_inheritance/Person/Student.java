package day49_inheritance.Person;

import day49_inheritance.Person.Person;

public class Student extends Person { //student is a person (person parent class, student child class)
     int funLevel;
     public void study(){
         System.out.println(name+" is studying");
     }
}
