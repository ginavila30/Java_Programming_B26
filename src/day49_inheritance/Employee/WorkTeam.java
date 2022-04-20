package day49_inheritance.Employee;

//Create objects of all three to see which variables and methods each object has access to
public class WorkTeam {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.name="Gina";
        employee1.isFullTime=true;
        employee1.salary=120;
        employee1.work();

        Tester tester1=new Tester();
        tester1.name="Elena";
        tester1.isFullTime=true;
        tester1.salary=120;
        tester1.bugsFound=5;
        tester1.work();
        tester1.test();

        Developer developer1=new Developer();
        developer1.name="Majid";
        developer1.isFullTime=true;
        developer1.salary=120;
        developer1.featuresCreated=4;
        developer1.work();
        developer1.develop();

    }
}
