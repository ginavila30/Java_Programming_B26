package day23_05_03_2022.cydeo;

public class Person {
   private String name;
   private final char gender;
   private int age;

    public Person(String name, char gender, int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    public void eat(String food){
        System.out.println( name+" eating "+food);
    }
    public void sleep(){
        System.out.println(name+ "is sleeping");
    }
    public void drink(String beverage){
        System.out.println(name+" is drinking "+beverage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
