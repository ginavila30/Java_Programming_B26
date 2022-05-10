package day05_05_09_2022.animal;

public class Runner {
    public static void main(String[] args) {
        Dog obj1= new Dog("Benji", 1,"Golden Doodle");
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
        System.out.println(obj1.breed);
        System.out.println(obj1.getAgeInHumanYears());
        System.out.println(obj1);
        Dog obj2=new Dog("Cuzco",1,"Border Coli");
        Dog obj3=new Dog("Benji",1,"Golden Doodle");
        System.out.println(obj1.equals(obj3));

    }
}
