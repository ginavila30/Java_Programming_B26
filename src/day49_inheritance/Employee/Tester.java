package day49_inheritance.Employee;

import day49_inheritance.Employee.Employee;

/*Create a class Tester

    - Tester class inherits Employee class

    - create additional variables:
        bugs found

    - create method:
        test()
            Example output: prints Running the regression*/
public class Tester extends Employee {
    public int bugsFound;

    public void test(){
        System.out.println("Running the regression test");
    }

}
