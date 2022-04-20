package day49_inheritance.Employee;
/*------------------------------------------------------------------------------

Create a Employee class

    - create variables:
        name, is full time, salary

    - create method:
        work()
            Example output: prints $name is working
*/
public class Employee {
    public String name;
    public boolean isFullTime;
    double salary;

    public void work(){
        System.out.println(name+" is working");
    }
}
