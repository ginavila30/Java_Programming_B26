package day25_05_09_2022.person;

import day25_05_09_2022.person.Person;

/* Student (abstract) inherits Person
                instance variables:      batchNumber
                abstract method:         attendClass()
                non-abstract method:     code(String language)
*/
public abstract class Student extends Person {
    int batchNum;

    public Student(String name, int age, int batchNum){
        super(name, age);
        this.batchNum=batchNum;
    }
    public abstract void attendClass();

    public void code(String language){
        System.out.println("Coding language: "+language);
    }


}
