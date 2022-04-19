package ShortVideos.inheritance;

public class Zoo {
    public static void main(String[] args) {
        Dog dog=new Dog();
        // below assigning values to the vxs inherited from animal class
        dog.name="Benji";
        dog.breed="Goldendoodle";
        dog.gender='M';
        dog.size="Medium";
        dog.age=1;
        dog.color="Apricot";
        dog.bark();// method unique for dog class
        dog.sleep();// method inherited
        System.out.println(dog);

        Cat cat=new Cat();
       // below assigning values to the vxs inherited from animal class
        cat.name="joey";
        cat.breed="unique";
        cat.gender='M';
        cat.age=1;
        cat.size="small";
        cat.color="ginger";

        cat.meow();//unique method for cat class
        cat.scratch();//unique method for cat class
        cat.sleep();// inherited method.
        System.out.println(cat);

        Fish fish=new Fish();
        // below assigning values to the vxs inherited from animal class
        fish.name="nemo";
        fish.breed="clownfish";
        fish.gender='M';
        fish.age=2;
        fish.size="small";
        fish.color="orange";

        fish.swim();// unique method for fish class
        fish.sleep();// inherited method from animal class
        System.out.println(fish);

    }
}
