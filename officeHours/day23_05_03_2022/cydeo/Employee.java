package day23_05_03_2022.cydeo;

public class Employee extends Person{
    private String jobTitle;
    private String employeeId;
    private double salary;

    public Employee(String name, char gender, int age, String employeeId, double salary, String jobTitle) {
        super(name, gender, age);
        this.employeeId = employeeId;
        this.salary = salary;
        this.jobTitle=jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println(getName()+" working");
    }
    public void attendMeeting() {
        System.out.println(getName()+" attending Meeting");
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString()+
                "jobTitle='" + jobTitle + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                '}';
    }
}
