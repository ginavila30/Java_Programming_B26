package day44_custom_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Make a class for Employee objects (from class)

    try to make an ArrayList of Employee objects
    maintain the list to have all the Employees that are SDET or Developer
    maintain a separate list of all the Employees who make over 100,000 salary
    find the max salary from the Employees
*/
public class EmployeeObjectsArrayList {
    public static void main(String[] args) {
        Employee number1=new Employee("Gina","1234","SDET",120000);
        Employee number2=new Employee("Majid","1234","Developer",150000);
        Employee number3=new Employee("Anna","1234","PO",180000);
        ArrayList<Employee>list1=new ArrayList<>(Arrays.asList(new Employee[]{number1, number2, number3}));
        System.out.println(list1);
        ArrayList<Employee>list2=new ArrayList<>(Arrays.asList(new Employee[]{number1, number2, number3}));

        ArrayList<Employee>retainTitle=new ArrayList<>();
        for (Employee each:list1) {
            if(each.jobTitle.equalsIgnoreCase("sdet")||each.jobTitle.equalsIgnoreCase("developer")){
                retainTitle.add(each);
            }
        }
        list1.retainAll(retainTitle);
        System.out.println(list1);

        ArrayList<Employee>retainSalary=new ArrayList<>();

       double compare=0;
       String maxSalaryName="";
        for (Employee each:list2) {
            if(each.salary>120000){
                retainSalary.add(each);
            }
            if(each.salary>compare){
              compare=each.salary;
              maxSalaryName=each.name;
            }
        }
        list2.retainAll(retainSalary);
        System.out.println(list2);
        System.out.println("The person with highes salary is: "+maxSalaryName+"--> $"+compare);





    }


}
