package day23_05_03_2022.cydeo;

public class Student extends Person{
    String schoolName;
    String studentId;

    public Student(String name, char gender, int age, String schoolName, String studentId){
        super(name,gender,age);
        this.schoolName=schoolName;
        this.studentId=studentId;
    }


    public void study() {
        System.out.println("Studying");
    }
    public void attendClass() {
        System.out.println("Attending Class");
    }

}
