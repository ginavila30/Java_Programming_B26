package day52_final_key_word.hiding;

public class Person {
    String name="James Bond";
}
class SecretIdentity extends Person{
    String name="DNOB SEMAJ"; // Created another name vx in  the subclass.but it was already being inherited. So now we are hiding the one form parent.
}
class Runner{
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.name);//James Bond

        SecretIdentity secretIdentity=new SecretIdentity();
        System.out.println(secretIdentity.name);//DNOB SEMAJ
    }
}
