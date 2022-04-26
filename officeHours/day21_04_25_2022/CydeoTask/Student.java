package day21_04_25_2022.CydeoTask;

public class Student extends Person {
    /* 1. Student
                	 variables: name, gender, age, schoolName, studentId
                	 methods: study(), attendClass()*/

    public String schoolName;
    public String studentId;
    public void study(){
        System.out.println("Study");
    }
    public void attendClass(){
        System.out.println("Attend class");
    }

}
