package day49_inheritance.Employee;

import day49_inheritance.Employee.Employee;

/*Create a class Developer

    - Developer class inherits Employee class

    - create additional variables:
        features created

    - create method:
        develop()
            Example output: prints Creating more features*/
public class Developer extends Employee {
    public int featuresCreated;
    public void develop(){
        System.out.println("Creating more features");
    }

}
