package day53_abstraction.person;

public abstract class Employee extends Person {
    String jobTitle;
    double salary;
    public Employee(String name, int age, String jobTitle, double salary){
        super(name, age);
        this.jobTitle=jobTitle;
        this.salary=salary;
    }
    public  abstract void work();

    @Override
    public String toString(){
        return "Name->"+name+" Age->"+age+" Job title->"+jobTitle+" Salary->"+salary;
    }
}
