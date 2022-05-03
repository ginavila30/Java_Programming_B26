package day23_05_03_2022.person;

public class Tester extends Employee{
    public Tester(String name, char gender, int age, String employeeId, double salary, String jobTitle) {
        super(name, gender, age, employeeId, salary, jobTitle);
    }

    @Override
    public void work() {
        System.out.println("Tester working on test cases");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Tester attending sprint planning meeting");
    }
}
