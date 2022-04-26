package day21_04_25_2022.employee;



public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary){
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public void setName(String name) {
        if (!name.isEmpty()&&!name.isBlank()) {
            this.name = name;
        } else
            System.err.println("Name can not be empty");
    }

    public String getName(){
        return name;
    }

    public void setGender(char gender) {
        if (gender == 'f' || gender == 'F' || gender == 'm' || gender == 'M') {
            this.gender = gender;
        } else {
            System.err.println("Invalid input for Gender");
        }
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.err.println("Invalid input for age");
        }
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.err.println("Invalid input for salary");}

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
