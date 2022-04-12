package day17_04_11_2022;

public class UsingStudent {
    public static void main(String[] args) {
        Student student1=new Student("Gina");
        System.out.println(student1);
        Student student2=new Student("Gina",27);
        System.out.println(student2);
        Student student3=new Student("Gina",27,26);
        System.out.println(student3);
    }
}
