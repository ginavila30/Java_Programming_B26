package day55_polymorphism.animal;

public class Reptile extends Animal {
    @Override
    public void eat() {
        System.out.println("Reptile is eating");
    }

    public void walk(){
        System.out.println("Walking");
    }
  public  int numOfClaws;

}
