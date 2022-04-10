package ShortVideos;

public class ConstructorEmployeeExample {
public String name;
public char gender;
public String jobTitle;
public double salary;
    public ConstructorEmployeeExample(String name, char gender, String jobTitle,double salary){
        this.name=name;
        this.gender=gender;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "ConstructorEmployeeExample{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
