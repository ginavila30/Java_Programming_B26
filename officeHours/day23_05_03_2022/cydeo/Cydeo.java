package day23_05_03_2022.cydeo;

public class Cydeo {
    public static void main(String[] args) {
        Student student=new Student("mike",'M',27,"cydeo","123");
        System.out.println(student);
        Tester tester=new Tester("Gina",'F',27,"1234",120,"tester");
        System.out.println(tester);
        tester.attendMeeting();
        tester.drink("water");
        tester.work();
    }
}
