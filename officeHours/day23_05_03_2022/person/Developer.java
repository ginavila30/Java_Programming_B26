package day23_05_03_2022.person;

public class Developer extends Employee{
    public Developer(String name, char gender, int age, String employeeId, double salary, String jobTitle) {
        super(name, gender, age, employeeId, salary, jobTitle);
    }

    @Override
    public void work() {
        System.out.println("Developer working on code units");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Developer attending grooming meeting");
    }
}
