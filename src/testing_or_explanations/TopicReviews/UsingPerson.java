package testing_or_explanations.TopicReviews;

public class UsingPerson {
    public static void main(String[] args) {
        Person person1=new Person("Elena",29); // OBJECT -> Copy of the class Person
        person1.name="simi";
        person1=new Person("Gina", 27);

        Person person2;
        person2=new Person("Raz",34);

        new Person("Kevin", 26);// created an object without reference.

        System.out.println(person1.name);
        System.out.println(person1.age);
        person1.breathing();

        System.out.println(person2.name);
        System.out.println(person2.age);
        person2.breathing();

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(Person.haveLegs);// accessing static vxs
        System.out.println(person2.haveLegs);
        person2.haveLegs=false;
        System.out.println("-----------------");
        System.out.println(person2.haveLegs);
        System.out.println(person1.haveLegs);

    }
}
