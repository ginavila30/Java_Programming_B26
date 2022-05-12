package day25_05_09_2022.person;

public class Runner {
    public static void main(String[] args) {
        OnlineStudent student1 = new OnlineStudent("GINA",27,26);
        student1.attendClass();
        student1.sleep();
        student1.code("Java");
        CampusStudent student2 = new CampusStudent("Max",27,2625);

        student2.attendClass();
        student2.sleep();
        student2.code("Python");

        Person student3 = new CampusStudent("Elena",27,2623);
        student3.sleep();
        Student student4=new CampusStudent("Simi",27,2622);
        student4.attendClass();
        student4.code("Ruby");
    }
}
