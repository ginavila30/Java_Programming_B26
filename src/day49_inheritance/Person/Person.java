package day49_inheritance.Person;

public class Person {
    String name;
    int age;
    String favHobby;
     private String race;

     public void setRace(String race){
         this.race=race;
     }
    public String getRace(){
        return race;
    }

    public void talk(){
        System.out.println(name+" is talking");
    }
}
