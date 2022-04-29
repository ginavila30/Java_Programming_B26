package day53_abstraction.person;

public class Tester extends Employee {

    public Tester (String name, int age, double salary){
        super(name,age,"Tester",salary);
    }
    @Override
    public void hobby() {
        System.out.println("Reading");
    }

    @Override
    public void work() {
        System.out.println("Running Test cases");
    }
}
