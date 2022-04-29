package day53_abstraction.person;

public class CreatingObjects {
    public static void main(String[] args) {
        Tester tester1=new Tester("Gina", 27,120);
        tester1.hobby();
        tester1.work();
        System.out.println(tester1);

        Chef chef1=new Chef("Max",34,120);
        chef1.hobby();
        chef1.work();

    }
}
