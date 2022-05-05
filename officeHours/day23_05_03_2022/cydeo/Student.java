package day23_05_03_2022.cydeo;

public class Student extends Person{
    private String schoolName;
    private String studentId;

    public Student(String name, char gender, int age, String schoolName, String studentId){
        super(name,gender,age);
        this.schoolName=schoolName;
        this.studentId=studentId;
    }


    public void study() {
        System.out.println(getName()+" Studying");
    }
    public void attendClass() {
        System.out.println(getName()+"Attending Class");
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                "schoolName='" + schoolName + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
