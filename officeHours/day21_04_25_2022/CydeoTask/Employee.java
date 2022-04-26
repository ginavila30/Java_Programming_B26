package day21_04_25_2022.CydeoTask;
/*2. Employee
                	variables: name, gender, age, jobTitle, employeeID, salary
                    methods: work(), attendMeeting()*/
public class Employee extends Person {
 String jobTitle;
 String employeeID;
 double salary;

 public void work(){
     System.out.println("Work");
 }

 public void attendMeeting(){
     System.out.println("Attend meeting");
 }


}
