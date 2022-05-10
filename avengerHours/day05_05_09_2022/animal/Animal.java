package day05_05_09_2022.animal;

public abstract class Animal {
     String name;
     int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public abstract int getAgeInHumanYears();

    public Animal(String name, int age){
       setName(name);
       setAge(age);
    }

}
