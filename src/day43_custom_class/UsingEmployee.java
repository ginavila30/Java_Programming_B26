package day43_custom_class;

import day43_custom_class.Employee;

public class UsingEmployee {
    public static void main(String[] args) {
        //Creating an object with overloaded constructor
        Employee employee1=new Employee("Simi","SDET");
        Employee employee2=new Employee("Elena","1234","SDET",150000);
        employee1.goToMeeting();
        employee2.goToMeeting();
        System.out.println(employee1);
        System.out.println("======================================================");
        System.out.println(employee2);

    }
}
