package day23_05_03_2022.person;

public class Employee extends Person{
    String jobTitle;
    String employeeId;
    double salary;

    public Employee(String name, char gender, int age, String employeeId, double salary, String jobTitle) {
        super(name, gender, age);
        this.employeeId = employeeId;
        this.salary = salary;
        this.jobTitle=jobTitle;
    }


    public void work() {
        System.out.println("working");
    }
    public void attendMeeting() {
        System.out.println("Attending Meeting");
    }
}
