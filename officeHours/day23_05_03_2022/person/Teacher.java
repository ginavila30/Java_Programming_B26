package day23_05_03_2022.person;

public class Teacher extends Employee {
    public Teacher(String name, char gender, int age, String employeeId, double salary, String jobTitle) {
        super(name, gender, age, employeeId, salary, jobTitle);
    }

    @Override
    public void work() {
        System.out.println("Teacher working at school");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Teacher attending weekly meeting");
    }
}
