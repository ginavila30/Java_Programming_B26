package day54_05_03_2022.language;

public class Runner {
    public static void main(String[] args) {
        //I can't create objects from Language interface, but I can create objects from the classes that implemented Language interface.Then the overridden methods will be access by each object.
        Spanish obj1=new Spanish();
        obj1.bye();
        obj1.hi();
        Turkish obj2=new Turkish();
        obj2.hi();
        obj2.bye();
        System.out.println(Language.PLANET);
    }
}
