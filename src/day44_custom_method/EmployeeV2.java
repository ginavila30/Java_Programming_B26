package day44_custom_method;

public class EmployeeV2 {


    String name;
    String id;
    String jobTitle;
    double salary;


    public EmployeeV2(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public EmployeeV2(String name, String id, String jobTitle, double salary) {
        this(name,jobTitle);//Chaining constructor. It should always be the first line code inside the constructor that is calling it.
        this.id = id;
        this.salary = salary;
    }


    public void goToMeeting() {
        System.out.println(name + " is going to a meeting");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
