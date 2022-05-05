package day23_05_03_2022.cydeo;

public class Tester extends Employee{
    public Tester(String name, char gender, int age, String employeeId, double salary, String jobTitle) {
        super(name, gender, age, employeeId, salary, jobTitle);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is working on test cases");
    }

    @Override
    public void attendMeeting() {
        System.out.println(getName()+"is attending sprint planning meeting");
    }

    @Override
    public void drink(String beverage) {
        System.out.println(getName()+" is drinking "+beverage);
    }
}
